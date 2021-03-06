define(function (require) {
    var Backbone = require('backbone');
    var Handlebars = require('handlebars');
    var $ = require('jquery');
    var _ = require('underscore');

    var Links = require('js/collections/Links');
    var Link = require('js/models/Link');
    var LinkRowView = require('js/views/links/LinkRowView');
    var ErrorHandler = require('js/views/ErrorHandler');

    var linkTable = require('text!js/templates/links/linkTable.hbs');

    return Backbone.View.extend(_.extend({
        events: {
            'click #btn-link-create': '_create',
            'click #btn-link-clear': '_resetModel'
        },
        bindings: {
            '#linkName': 'linkName',
            '#url': 'url'
        },

        template: Handlebars.compile(linkTable),

        initialize: function () {
            this.listenTo(this.collection, 'sync', this.renderTable);
        },
        render: function () {
            this.$el.html(this.template());
            this._resetModel();
            return this;
        },
        renderTable: function () {
            var $tbody = this.$('tbody').empty();
            this.collection.each(function (link) {
                $tbody.append(new LinkRowView({
                    model: link
                }).render().el)
            });
            return this;
        },

        _create: function () {
            if (!this.model.isValid(true)) {
                return false;
            }
            this.collection.create(this.model, {
                success: _.bind(this._resetModel, this),
                error: _.bind(function (model, response) {
                    this.showErrors(response.responseJSON);
                }, this)
            });
        },

        _resetModel: function () {
            if (this.model) {
                this.unstickit(this.model);
                Backbone.Validation.unbind(this);
            }
            this.model = new Link();
            Backbone.Validation.bind(this);
            this.stickit();
        }
    }, ErrorHandler));
});