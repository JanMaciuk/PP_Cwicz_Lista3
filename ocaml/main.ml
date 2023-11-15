(*
   ocamlc -o main.byte main.ml
    ./main.byte   
*)
let sumProd list = List.fold_left (fun (sum,product) x -> (sum+x, product*x)) (0,1) list;;

let result = sumProd [1;2;3;4;5];;
print_endline (string_of_int (fst result));;
print_endline (string_of_int (snd result));;
