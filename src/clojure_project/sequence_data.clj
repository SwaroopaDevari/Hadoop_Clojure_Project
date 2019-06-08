(def ph1 "309-533-8031")

(def ph2 "309-533-8032")

(def ph3 "309-533-8033")

(map #(re-find #"309+" %)
     [ph1 ph2 ph3])



(defn test-phone [a b c]
  (let [ph1 a
        ph2 b
        ph3 c
        ph  [ph1 ph2 ph3]
        ]
    (map #(re-find #"309+" %)
         [ph1 ph2 ph3])
    )

  )

(test-phone "309-533-8031" "309-533-8032" "309-533-8033")



(def ph [ph1 ph2 ph3])

(count
 (map #(re-find #"309+" %) ph))

(= 3
   (count
    (map #(re-find #"309+" %) ph)))


(clojure.string/split "308 5765 78 ggh" #"\s+")

(re-seq #"based|on" "Clojure ois based on LISP")

(re-matches #"(\W+)\S(\W+)" "September October")

(re-seq #"[A-Za-z0-9|']+" "AgdE74s")

(re-seq #"[A-Za-z0-9|']+" "AgdE7 4s")




;(ns clojure-project.sequence-data)
;
;(def ord_status ["CLO" "opened" "pending123" "CompleTed 234"])
;(filter #(re-matches #"[A-Z]{3}" % )
;          ord_status)
;
;(def ord_status ["CLOSED" "opened" "pending123" "CompleTed 234"])
;(filter #(re-find #"[A-Z]{3}" %)
;        ord_status)
;
;(def ord_status ["CLOSED" "opened" "pending123" "CompleTed 234"])
;(filter #(re-matches #"([A-Z]+|[0-9]){3}" %)
;        ord_status)
;
;(def ord_status ["CLOSED" "opened" "pending123" "CompleTed 234"])
;(filter #(re-matches #"([A-Z]+|[0-9]+\s){3}" %)
;        ord_status)
;
;(def ord_status1 ["CLOSED7899" "opened" "pending123" "CoMpleTed 234" "Ca9 Hat" "Ca9   "])
;(filter #(re-matches #"([A-Z]+|[0-9]+\s){3}" %)
;        ord_status1)
;
;(def ord_status1 ["CLOSED7899" "opened" "pending123" "CoMpleTed 234" "Ca9 Hat" "Ca9   "])
;(filter #(re-find #"([A-Z]+|[0-9]+\s){3}" %)
;        ord_status1)
;
;(def ord_status1 ["CLOSED7899" "opened" "pending123" "CoMpleTed 234" "Ca9 Hat" "Ca9   "])
;(filter #(re-matches #"([A-Z]+[a-z]+|[0-9]+\s+\S){3}" %)
;        ord_status1)
;
;(def ord_status1 ["CLOSED7899" "opened" "pending123" "CoMpleTed 234" "Ca9 Hat" "Ca9   "])
;(filter #(re-find #"([A-Z]+[a-z]+|[0-9]+\s+\S){3}" %)
;        ord_status1)
;
;(def ord_status1 ["CLOSED7899" "opened" "pending123" "CoMpleTed 234" "Ca9 Hat" "Ca9   "])
;(filter #(re-find #"([A-Z]+[a-z]+|[0-9]+\s+\S){3}" %)
;        ord_status1)
;
;(def ord_status1 ["CLOSED7899" "opened" "pending123" "CoMpleTed 234" "Ca9 Hat" "Ca9   "])
;(filter #(re-find #"([A-Z]+[a-z]+|[0-9]+\s+{5})" %)
;        ord_status1)
;
;(defn check-for-validation [string-input]
;  (filter #(re-matches #"[A-Z0-9]{4}" %) string-input)
;  )
;
;
;(= true? (reverse "madam"))
;
;(= "madam" (clojure.string/reverse "madam"))
;
;(filter (fn[word] (= "is" word))["clojure" "is" "great"])
;
;(filter (fn[word] (not= "is" word))["clojure" "is" "great"])
;
;(filter #(not= "is" %)["clojure" "is" "great"])
;
;(remove #(= "is" %)["clojure" "is" "great"])
;
;(def act["CaSf fG1d2S", "Taj1 8IvdLL", "RS23F", "26"])
;
;(filter #(re-find #"([A-Z]+|[a-z]+|[0-9]+\s){2}" %)
;        act)
;
;(filter #(re-find #"([A-Z]+|[0-9]+\s){2}" %)
;        act)
;
;(filter #(re-find #"([A-Z]+|[0-9]+\s+\d\d\d){2}" %)
;        act)
;
;(filter #(re-find #"(\d){2}" %)
;        act)
;
;(filter #(re-matches #"(\d){2}" %)
;        act)
;
;(re-seq #"[A-Z]+" "A2Hkk  Y8")
;
;(apply str(re-seq #"[A-Z]+" "A2Hkk Y8"))
