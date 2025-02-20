const assert = require('assert');

describe ('greet function', ()=> {
    // arrange  => makes sure that what we will test is going to be available and ready in the code
    const greeter = require('./index.js');

    it ('should greet Marcus properly', () => {



    // act => where we write the test. For simplicity, only one thing per test

    const actualResult = greeter.greet('Marcus');

    // assert. check if what we want, is what we got as result from the greet function

    assert.equal('Welcome to SALT, Marcus', actualResult);

    });
});