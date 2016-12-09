                                        ;Contains basic examples of map function
(defn mapsquare
  "Function that maps a function on a sequence"
  [listOfIntegers]
  (map square listOfIntegers))

(defn fullNames
  "Function that creates a first name and last name string"
  [FirstName LastName]
  (str FirstName " " LastName))

(defn mapNames
  "Function used fullNames function. Accepts FirstName and LastName and returns map for each"
  [FirstNamesList LastNamesList]
  (map fullNames FirstNamesList LastNamesList))

(defn toUpper
  [string]
  (.toUpperCase string))

(defn splitString
  [str delimeter]
  (.split str delimeter))




