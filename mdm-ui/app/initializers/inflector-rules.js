import Inflector from 'ember-inflector';

export function initialize(/* application */) {
  const inflector = Inflector.inflector;

  inflector.irregular('employee', '');
}

export default {
  name: 'inflector-rules',
  initialize
};
