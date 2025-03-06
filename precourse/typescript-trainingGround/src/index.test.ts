import "mocha";
import assert from "assert";
import { greet, isOld } from "./index";

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
