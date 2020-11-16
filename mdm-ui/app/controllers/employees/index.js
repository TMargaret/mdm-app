import Controller from '@ember/controller';

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

}
