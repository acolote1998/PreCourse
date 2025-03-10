const products = [
  { title: "Cabbage", isFruit: false, id: 1 },
  { title: "Tomato", isFruit: true, id: 2 },
  { title: "Cheese", isFruit: false, id: 3 },
];

export default function ShoppingList() {
  const listItems = products.map((product) => (
    <li
      key={product.id}
      style={{ color: product.isFruit ? "magenta" : "darkgreen" }}
    >
      {product.title}
    </li>
  ));

  return <ul>{listItems}</ul>;
}
