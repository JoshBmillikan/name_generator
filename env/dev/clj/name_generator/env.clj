(ns name-generator.env
  (:require
    [selmer.parser :as parser]
    [clojure.tools.logging :as log]
    [name-generator.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[name_generator started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[name_generator has shut down successfully]=-"))
   :middleware wrap-dev})
