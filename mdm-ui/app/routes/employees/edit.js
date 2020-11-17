import Route from '@ember/routing/route';
import $ from "jquery";

export default class EmployeesEditRoute extends Route {
  async model() {
    return $.getJSON("/devices").then(data => {
      return data.content
    });
  }
}
