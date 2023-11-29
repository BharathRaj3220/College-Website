let btn = document.querySelector("#btn");

btn.addEventListener("click", () => {
	let inp1 = document.querySelector("#inp1").value;
	let inp2 = document.querySelector("#inp2").value;
	let inp3 = document.querySelector("#inp3").value;
	let inp4 = document.querySelector("#inp4").value;
	let inp5 = document.querySelector("#inp5").value;
	let inp6 = document.querySelector("#inp6").value;
	let inp7 = document.querySelector("#inp7").value;
	let inp8 = document.querySelector("#inp8").value;
	let inp9 = document.querySelector("#inp9").value;
	let inp10 = document.querySelector("#inp10").value;
	let inp11 = document.querySelector("#inp11").value;
	let inp12 = document.querySelector("#inp12").value;
	let inp13 = document.querySelector("#inp13").value;
	let inp14 = document.querySelector("#inp14").value;

	if (inp1 != null && inp2 != null && inp3 != null && inp4 != null && inp5 != null && inp6 != null && inp7 != null && inp7 != null && inp8 != null && inp9 != null && inp10 != null && inp11 != null && inp12 != null && inp13 != null && inp14 != null) {
		alert("data stored sucessfully");
	} else {
		alert("add datas properly");
	}
});