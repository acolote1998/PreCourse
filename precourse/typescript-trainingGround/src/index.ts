function greet(name: string, birthYear: number): string {
  const age = new Date().getFullYear() - birthYear;

  return `Hello ${name}, you are ${age} years old`;
}

const isOld = (age: number) => age >= 35;

const countOdd = (arr: number[]) => {
  let oddnumber: number = 0;
  for (let i = 0; i < arr.length; i++) {
    if (arr[i] % 2 > 0) {
      oddnumber++;
    }
  }
  return oddnumber;
};

const sumEvenNumbers = (arr: number[]) => {
  let summedNumbers = 0;
  for (let i = 0; i < arr.length; i++) {
    if (arr[i] % 2 == 0) {
      summedNumbers += arr[i];
    }
  }
  return summedNumbers;
};

type Address = {
  street: string;
  streetNo: number;
  city: string;
};

type Person = {
  name: string;
  birthYear: number;
  address: Address;
};

const getPersonStreetNo = (person: Person) => person.address.streetNo;

class PersonClass {
  private name: string = "";

  private birthYear: number = 0;

  public getName() {
    return this.name;
  }

  public getBirthYear() {
    return this.birthYear;
  }

  constructor(name: string, brithYear: number) {
    this.name = name;
    this.birthYear = this.birthYear;
  }
}

class EmployeeClass extends PersonClass {
  private employeeId: number = -1;

  public getEmployeeId() {
    return this.employeeId;
  }

  public setEmployeeId(id: number) {
    this.employeeId = id;
  }
}

interface IPerson {
  name: string;
  birthYear: number;
}

const getPersonNameString = (p: IPerson): string => `${p.name}, ${p.birthYear}`;

const printThis = (p: Person | undefined | null) => {
  if (!p) {
    return "no person supplied";
  }
  return p.name;
};

const optionallyAdd = (
  num1: number,
  num2: number,
  num3?: number,
  num4?: number,
  num5?: number
) => {
  let sum = num1 + num2;
  sum += num3 ? num3 : 0;
  sum += num4 ? num4 : 0;
  sum += num5 ? num5 : 0; // <- ahora está correcto
  return sum; // <- Falta devolver el resultado
};

export {
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
};
