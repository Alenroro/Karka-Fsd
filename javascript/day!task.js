// const addTwoNumbers = (a, b) => a + b;
// console.log(addTwoNumbers(2, 3));

// const findAreaOfTriangle = (base, height) => 0.5 * base * height;
// console.log(findAreaOfTriangle(20, 30));

// const swapVariables = (a, b) => [b, a];
// console.log(swapVariables(20, 30));

// const calculateResult = (a, b, c, d) => ((a + b) * c) / d;
// console.log(calculateResult(20, 30, 50, 10));

// const personDetails = {
//   name: "John",
//   age: 25,
//   dob: "1999-01-01",
//   height: 175,
//   weight: 70,
//   degree: "Bachelor",
//   gender: "Male",
//   is_alive: true,
// };
// console.log(personDetails);

// const word1 = "hello";
// const word2 = "world";
// console.log(`${word1} ${word2}`);

// const userName = "alen";
// console.log(`Hello, ${userName}!`);

// const userAge = 24;
// const yearsToHundred = 100 - userAge;
// console.log(`You will turn 100 in ${yearsToHundred} years.`);

// const num1 = 98;
// const num2 = 100;
// const num3 = 89;
// const result = (num1 + num2 + num3) / 2;
// console.log(`Result: ${result}`);

// const a=["Sajin","Alen","Sanjay","Steffi"];
// a.map((_,i)=>{
//   console.log(i)
// })

// const arr=[1,2,3,4,5,6,7];
// arr.filter(numb=>numb%2===0)
//   console.log(numb);


//   const person = {
//     name: 'John',
//     age: 30,
//     country: 'USA'
//   };
  
//   // Destructuring assignment
//   const { name, age, country } = person;
  
//   console.log(name);    // Output: John
//   console.log(age);     // Output: 30
//   console.log(country); // Output: USA
  
//   function displayInfo({ name, age, country }) {
//     console.log(`${name} is ${age} years old and lives in ${country}.`);
//   }
  
//   displayInfo(person); // Output: John is 30 years old and lives in USA.
  

//   const person1 = {
//     name: 'Emily',
//     age: 28,
//     city: 'Paris'
//   };
  
//   // Function with destructuring in parameter
//   function createProfile({ name, age, city }) {
//     return {
//       fullName: name,
//       yearsOld: age,
//       location: city
//     };
//   }
  
//   const profile = createProfile(person1);
//   console.log(profile);
  


//   let myobj={
//     tamil:89,
//     english:90,
//     maths:98,
//     science:97,
//     socialscience:93
// }
// const total=Object.values(myobj).reduce((accum,num)=>{
//     return accum + num
// },0)
// console.log(total)

let arr=[1,2,3,4]
arr.forEach(op=>console.log(op))

let a=["Apple","Orange","Grapes"]
console.log(a.includes("Apple"))

const array = [1, 2, 3, 4, 5];
array.splice(2, 1,"Alen"); // Removes 1 element starting from index 2
console.log(array); // Output: [1, 2, 4, 5]

for (const ele of arr)
console.log(ele)

const array1=["Apple","orange","grapes"]
const b=array1.join(" ")
console.log(b)