"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.EmployeeClass = exports.PersonClass = void 0;
exports.greet = greet;
exports.isOld = isOld;
exports.countOdd = countOdd;
exports.sumEvenNumbers = sumEvenNumbers;
exports.getPersonStreetNo = getPersonStreetNo;
exports.getPersonNameString = getPersonNameString;
function greet(name, birthYear) {
    const age = new Date().getFullYear() - birthYear;
    return `Hello ${name}, you are ${age} years old`;
}
function isOld(age) {
    return age >= 35;
}
function countOdd(arr) {
    let oddnumber = 0;
    for (let i = 0; i < arr.length; i++) {
        if (arr[i] % 2 > 0) {
            oddnumber++;
        }
    }
    return oddnumber;
}
function sumEvenNumbers(arr) {
    let summedNumbers = 0;
    for (let i = 0; i < arr.length; i++) {
        if (arr[i] % 2 == 0) {
            summedNumbers += arr[i];
        }
    }
    return summedNumbers;
}
function getPersonStreetNo(person) {
    return person.address.streetNo;
}
class PersonClass {
    getName() {
        return this.name;
    }
    getBirthYear() {
        return this.birthYear;
    }
    constructor(name, brithYear) {
        this.name = "";
        this.birthYear = 0;
        this.name = name;
        this.birthYear = this.birthYear;
    }
}
exports.PersonClass = PersonClass;
class EmployeeClass extends PersonClass {
    constructor() {
        super(...arguments);
        this.employeeId = -1;
    }
    getEmployeeId() {
        return this.employeeId;
    }
    setEmployeeId(id) {
        this.employeeId = id;
    }
}
exports.EmployeeClass = EmployeeClass;
function getPersonNameString(p) {
    return `${p.name}, ${p.birthYear}`;
}
//# sourceMappingURL=index.js.map