import "mocha";
import assert from "assert";
import {
  greet,
  isOld,
  countOdd,
  sumEvenNumbers,
  Person,
  Address,
  getPersonStreetNo,
  PersonClass,
  EmployeeClass,
  IPerson,
  getPersonNameString,
  printThis,
  optionallyAdd,
} from "./index";

describe("ts test", () => {
  it("get greeting", () => {
    // arrange
    const birthYear = 1972;
    const name = "Marcus";

    //act

    const result = greet(name, birthYear);

    //assert

    assert.strictEqual(result, "Hello Marcus, you are 53 years old");
  });
});

it("returns true if age is above or equal to 35", () => {
  // act
  const is34Old = isOld(34);
  const is35Old = isOld(35);
  const is36Old = isOld(36);

  // assert
  assert.strictEqual(is34Old, false);
  assert.strictEqual(is35Old, true);
  assert.strictEqual(is36Old, true);
});

it("fun with variables", () => {
  //act

  let name: string = "Marcus";
  let nameImplicit = "Marcus";
  let nameImplicit2 = name;

  const cool: boolean = true;
  const birthYear = 1972;

  //arrange
  assert.strictEqual(typeof cool, "boolean");
  assert.strictEqual(typeof birthYear, "number");
  assert.strictEqual(typeof nameImplicit, "string");
  assert.strictEqual(typeof nameImplicit2, "string");
  assert.strictEqual(typeof name, "string");
});

it("count odd numbers", () => {
  //arrange
  const firstFive = [1, 2, 3, 4, 5];

  //act
  const numberOfOdds = countOdd(firstFive);

  //arrange

  assert.strictEqual(numberOfOdds, 3);
});

it("sums even numbers", () => {
  //arrange
  const nums = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
  //actr
  const testsumEvenNumbers = sumEvenNumbers(nums);

  //arrange

  assert.strictEqual(testsumEvenNumbers, 30);
});

it("gets the street number for a person", () => {
  //arrange
  const p: Person = {
    name: "Marcus",
    birthYear: 1972,
    address: {
      street: "Solnatest",
      streetNo: 25,
      city: "Stockholm",
    },
  };

  //act

  const streetN = getPersonStreetNo(p);

  // assert

  assert.strictEqual(streetN, 25);
});

it("using classes", () => {
  const p = new PersonClass("Marcus", 1972);
  const e = new EmployeeClass("Marcus Employee", 1972);

  //act

  e.setEmployeeId(12345);

  //assert

  assert.strictEqual(p.getName(), "Marcus");
  assert.strictEqual(e.getName(), "Marcus Employee");
  assert.strictEqual(e.getEmployeeId(), 12345);
});

it("prints an IPerson", () => {
  //arrange
  const p1: IPerson = { name: "Marcus", birthYear: 1972 };
  const p2 = { name: "David", birthYear: 1975, drummer: true };

  //act

  const p1Address = getPersonNameString(p1);
  const p2Address = getPersonNameString(p2);

  //assert

  assert.strictEqual(p1Address, "Marcus, 1972");
  assert.strictEqual(p2Address, "David, 1975");
});

it("uses union types to allow nul", () => {
  //act
  const result1 = printThis(undefined);
  const result2 = printThis(null);

  //assert

  assert.strictEqual(result1, "no person supplied");
  assert.strictEqual(result2, "no person supplied");
});

it("optional parameters", () => {
  //act

  const sum = optionallyAdd(1, 2, 3, 4, 5);

  //assert

  assert.strictEqual(sum, 3);
});
