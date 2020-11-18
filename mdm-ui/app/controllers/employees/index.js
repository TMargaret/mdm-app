import Controller from '@ember/controller';
import { action } from '@ember/object';
import { tracked } from '@glimmer/tracking';

export default class EmployeesIndexController extends Controller {

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
      url: '/employees/delete/' + employeeId,
      type: 'GET',
      success: function(result) {
        window.location.reload();
      },
      error: function(response) {
        console.log(response)
      }
    });
  }

}
