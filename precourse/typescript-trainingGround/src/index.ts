function greet(name: string, birthYear: number): string {
  const age = new Date().getFullYear() - birthYear;

  return `Hello ${name}, you are ${age} years old`;
}

function isOld(age: number) {
  return age >= 35;
}

function countOdd(arr: number[]) {
  let oddnumber: number = 0;
  for (let i = 0; i < arr.length; i++) {
    if (arr[i] % 2 > 0) {
      oddnumber++;
    }
  }
  return oddnumber;
}

function sumEvenNumbers(arr: number[]) {
  let summedNumbers = 0;
  for (let i = 0; i < arr.length; i++) {
    if (arr[i] % 2 == 0) {
      summedNumbers += arr[i];
    }
  }
  return summedNumbers;
}

export { greet, isOld, countOdd, sumEvenNumbers };
