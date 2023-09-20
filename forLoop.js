for (let i = 2; i < 100; i++) {
  //   console.log(i);
  let isPrime = false;
  for (let j = 2; j < i; j++) {
    if (i % j === 0) {
      isPrime = false;
      break;
    } else {
      isPrime = true;
    }
  }
  if (isPrime) console.log("prime", i);
}
