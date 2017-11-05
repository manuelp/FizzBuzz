(ns fizzbuzz.test.core
  (:use [fizzbuzz.core])
  (:use [clojure.test]))

(deftest one
  (is (= 1 (fizzbuzz 1))))

(deftest two
  (is (= 2 (fizzbuzz 2))))

(deftest three
  (is (= "Fizz" (fizzbuzz 3))))

(deftest four
  (is (= 4 (fizzbuzz 4))))

(deftest five
  (is (= "Buzz" (fizzbuzz 5))))

(deftest six
  (is (= "Fizz" (fizzbuzz 6))))

(deftest nine
  (is (= "Fizz" (fizzbuzz 9))))

(deftest ten
  (is (= "Buzz" (fizzbuzz 10))))

(deftest fifteen
  (is (= "FizzBuzz" (fizzbuzz 15))))

;; --- Stage 2

(deftest fizz-if-contains-a-3
  (is (= "Fizz" (fizzbuzz 13))))

(deftest buzz-if-contains-a-5
  (is (= "Buzz" (fizzbuzz 52))))
