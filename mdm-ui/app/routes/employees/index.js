import Route from '@ember/routing/route';
import $ from 'jquery';

export default class EmployeesIndexRoute extends Route {
  async model() {
    return $.getJSON("/employees").then(data => {
      return data.content
    });
  }
}
