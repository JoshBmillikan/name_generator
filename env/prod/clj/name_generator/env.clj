(ns name-generator.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[name_generator started successfully]=-"))
   :stop
   (fn []
     (log/info "\n-=[name_generator has shut down successfully]=-"))
   :middleware identity})
