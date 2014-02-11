define(function (require) {
    var Backbone = require('backbone');
    var _ = require('underscore');

    return Backbone.Model.extend({
        idAttribute: 'fileId',
        urlRoot: 'api/v1/files',
        validation: {
            file: {
                required: true
            }
        },

        isImage: function () {
            return _.contains(["png", "jpg", "jpeg", "gif"], this.get('fileExtension'));
        }
    });
});