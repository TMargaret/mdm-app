import Controller, { inject as controller} from '@ember/controller';
import { action } from '@ember/object';
import { alias } from '@ember/object/computed';
import $ from "jquery";

export default class EmployeesIndexController extends Controller {

  @controller employees;
  @alias('employees.company') company;
  queryParams = ['company'];

  columns = [
    { name: 'Id', valuePath: 'id' },
    { name: 'Name', valuePath: 'name' },
    { name: 'Email', valuePath: 'email' },
    { name: '', valuePath: 'edit'},
    { name: '', valuePath: 'delete' },
  ];

  sorts = [
    {
      valuePath: 'name',
      isAscending: false,
    },
    {
      valuePath: 'price',
      isAscending: true,
    },
  ]

  @action
  deleteEmployee(employeeId) {
    $.ajax({
      url: '/employees/' + employeeId,
      type: 'DELETE',
      success: function() {
        window.location.reload();
      },
      error: function(response) {
        console.log(response)
      }
    });
  }

}
