const assert = require('assert');

describe ('greet function', ()=> {
    it ('should greet Marcus properly', () => {

    // arrange  => makes sure that what we will test is going to be available and ready in the code

    const greeter = require('./index.js');

    // act => where we write the test. For simplicity, only one thing per test

    const actualResult = greeter.greet('Marcus');

    // assert. check if what we want, is what we got as result from the greet function

    assert.equal('Welcome to SALT, Marcus', actualResult);

    });
});