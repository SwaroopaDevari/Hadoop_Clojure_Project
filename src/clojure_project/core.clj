(ns clojure-project.core)

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, Vedu"))

(def ord_status ["CLO" "opened" "pending123" "CompleTed 234"])
(filter #(re-matches #"[A-Z]{3}" % )
          ord_status)