(ns fizzbuzz.core)

(defn fizzbuzz [num]
  (letfn [(divisible-for [num div]
            (= 0 (mod num div)))
          (contains-val [num val]
            (letfn [(int-to-char [n]
                      (first (. n toString)))]
              (some (partial = (int-to-char val)) (seq (str num)))))]
    (cond (and (divisible-for num 3) (divisible-for num 5)) "FizzBuzz"
          (or (divisible-for num 3) (contains-val num 3)) "Fizz"
          (or (divisible-for num 5) (contains-val num 5)) "Buzz"
          :default num)))