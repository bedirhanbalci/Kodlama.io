let sayi1 = 10;
sayi1 = "Bedirhan Balci";
let student = { id: 1, name: "Bedirhan" };
// console.log(student);

function save(puan = 10, ogrenci) {
  console.log(ogrenci.name + " : " + puan);
}

save(undefined, student);

let students = [
  "Bedirhan Balci",
  "Halit Kalayci",
  "Engin Demirog",
  "Emirhan Balci",
];

console.log(students);

let students2 = [
  student,
  { id: 2, name: "Emirhan" },
  "Ankara",
  { city: "İstanbul" },
];
console.log(students2);
