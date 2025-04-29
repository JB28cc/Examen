$(document).ready( function() {
    $("#btnEnviar").click(function () {
        let textoEnClaro = $("#txtTextoEnClaro").val();
       let parametro = {texto:cifrar(textoEnClaro)};
       $.get("cifrar", parametro, function(dato) {
        console.log(dato);
        });
    });
});

function cifrar(mensajeOriginal) {
    let nuevoMensaje = "";
    let len = mensajeOriginal.length;
    for (i = 0; i < len; i++) {
        let c = mensajeOriginal.charCodeAt(i);
        let code = parseInt(c);
        code += 1;
        let nc = String.fromCharCode(code);
        nuevoMensaje += nc;
    }
    return nuevoMensaje;
}
function decifrar(mensajeOriginal) {
    let nuevoMensaje = "";
    let len = mensajeOriginal.length;
    for (i = 0; i < len; i++) {
        let c = mensajeOriginal.charCodeAt(i);
        let code = parseInt(c);
        code -= 1;
        let nc = String.fromCharCode(code);
        nuevoMensaje += nc;
    }
    return nuevoMensaje;
}

let mensajeEnClaro = "¡Arriba Alianza!";
let mensajeCifrado = cifrar(mensajeEnClaro);
console.log(mensajeCifrado);
console.log(decifrar(mensajeCifrado));