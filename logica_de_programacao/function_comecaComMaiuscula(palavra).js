function comecaComMaiuscula(palavra){
   return /^[A-Z]/.test(palavra)
}
 
var palavras = ["Amor", "copo", "Bolacha", "biscoito"];
 
// Seu código vem aqui embaixo.


for(var i=0;i < palavras.length; i++){
   if(palavras[i] >= 'A' && palavras[i] <= 'Z'){
      comecaComMaiuscula(true);
      console.log("Começa com maiúscula")
   }

   else{
      comecaComMaiuscula(false);
      console.log("Não começa com maiúscula")
   }
}