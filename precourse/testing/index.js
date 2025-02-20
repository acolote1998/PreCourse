function greet(namePassedIn) {
  if (!namePassedIn) {
    throw new Error("Name cannot be empty");
  }
  return "Welcome to SALT, " + namePassedIn;
}

module.exports.greet = greet;
