(ns clojure-project.core)

(defn check-for-validation [string-input]
  (filter #(re-matches #"[A-Z0-9]{4}" %) string-input)
  )

(defn string-validation [input]

  (let [get-only-strings         (filter #(string? %) input)
        check-for-any-strings    (if (empty? get-only-strings)
                                   "no strings in the input data"
                                   (check-for-validation get-only-strings )
                                   )
        ]
    check-for-any-strings
    )
  )

;;(defn -main [& args]

  (string-validation ["ABCd" "1234" "@#$%" "poi9" "DFEW" "123456789" "ABCDEFGHIJKL" "        "  "/.,mn" "WXYZ" 1234 2M])

