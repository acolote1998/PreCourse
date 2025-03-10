function MyButton() {
  const name = prompt("What is your name?");
  let content;
  if (name == "aki") {
    content = "You are the best";
  } else {
    content = "Uhm... hi...";
  }
  return <h1>{content}</h1>;
}

export default MyButton;
