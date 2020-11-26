import EmberRouter from '@ember/routing/router';
import config from 'mdm-ui/config/environment';

export default class Router extends EmberRouter {
  location = config.locationType;
  rootURL = config.rootURL;
}

Router.map(function() {
  this.route('employees', function() {
    this.route('add');
    this.route('index', {path:'/'})
    this.route('edit', {path: '/:employeeId/edit'});
    this.route('view', {path: '/:employeeId/view'}, function() {
      this.route('edit', {path: '/:deviceId/edit'});
      this.route('add');
      this.route('index', {path: '/'}, function() {});
    });
  });
});
