import Route from '@ember/routing/route';
import $ from "jquery";

export default class IndexRoute extends Route {

  async model() {
    return $.ajax('/companies').then(data => {
      return data;
    });
  }
}
