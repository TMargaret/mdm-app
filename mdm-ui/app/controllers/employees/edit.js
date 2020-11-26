import Controller from '@ember/controller';
import $ from "jquery";
import { action } from '@ember/object';
import {tracked} from "@glimmer/tracking";

export default class EmployeesEditController extends Controller {

  @tracked employee;

  @action
  saveEmployee(employee) {
    $.getJSON({
          type: 'POST',
          url: "/employees/employee",
          data: JSON.stringify(employee),
          contentType: "application/json",
          dataType: "json",
        }).then(() => {
          this.transitionToRoute('employees', {queryParams: {company: employee.company.name}})
      })
  }
}
