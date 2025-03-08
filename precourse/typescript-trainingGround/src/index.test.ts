import "mocha";
import assert from "assert";
import { greet, isOld, countOdd, sumEvenNumbers } from "./index";

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
