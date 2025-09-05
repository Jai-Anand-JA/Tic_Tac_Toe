let boxes = document.querySelectorAll(".box");
let resetbtn = document.querySelector("#reset");
let message = document.querySelector(".msg");
let turn = true;

boxes.forEach((box, index) => {
    box.addEventListener("click", () => {
        fetch(`/move?position=${index}`, { method: "POST" })
            .then(res => res.text())
            .then(data => {
                if (turn) {
                    box.innerText = "X";
                } else {
                    box.innerText = "O";
                }
                turn = !turn;
                box.disabled = true;

                if (data.includes("Winner")) {
                    message.hidden = false;
                    message.innerText = data.split("Winner: ")[1] + " wins!";
                    boxes.forEach(b => b.disabled = true);
                }
            })
            .catch(err => console.error(err));
    });
});

resetbtn.addEventListener("click", () => {
    fetch(`/reset`)
        .then(res => res.text())
        .then(() => {
            boxes.forEach((box) => {
                box.innerText = "";
                box.disabled = false;
            });
            turn = true;
            message.hidden = true;
        })
        .catch(err => console.error(err));
});
