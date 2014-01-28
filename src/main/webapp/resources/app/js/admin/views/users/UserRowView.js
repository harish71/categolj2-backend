define(function (require) {
    var Backbone = require('backbone');
    var Handlebars = require('handlebars');
    var $ = require('jquery');
    var _ = require('underscore');

    var userRow = require('text!app/js/admin/templates/users/userRow.hbs');

    return Backbone.View.extend({
        tagName: 'tr',
        template: Handlebars.compile(userRow),

        events: {
            'dblclick': '_toggleEdit',
            'keypress': '_finishEdit',
            'click #btn-user-edit': '_enableEdit',
            'click #btn-user-delete': '_delete'

        },
        bindings: {
            '[name=username]': 'username',
            '[name=email]': 'email',
            '[name=firstName]': 'firstName',
            '[name=lastName]': 'lastName',
            '[name=roles]': {
                observe: 'roles',
                onGet: function (value) {
                    return _.map(value, String);
                },
                onSet: function (value) {
                    return _.map(value, Number);
                }
            },
            '[name=enabled]': 'enabled',
            '[name=locked]': 'locked'
        },

        initialize: function () {
        },
        render: function () {
            this.$el.html(this.template(this.model.toJSON()));
            this.stickit();
            return this;
        },
        _toggleEdit: function () {
            if (this.$el.hasClass('editing')) {
                this._disableEdit();
            } else {
                this._enableEdit();
            }
        },
        _finishEdit: function (e) {
            if (e.keyCode != 13) return;
            this._disableEdit();
        },
        _enableEdit: function () {
            this.$el.addClass('editing');
            this.render();
            this.$('input:checkbox').prop('disabled', false);
        },
        _disableEdit: function () {
            this.$el.removeClass('editing');
            this.render();
            this.$('input:checkbox').prop('disabled', true);
        },
        _delete: function () {
            if (confirm('Are you sure to delete?')) {
                this.model.destroy();
                this.remove();
            }
            return false;
        }
    });
});
