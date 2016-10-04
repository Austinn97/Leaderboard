# CSV-JSON Converter
There are standard plain-text data formats that are commonly used. The most popular are CSV, JSON, and XML. In this assignment, you must create a converter to translate between CSV and JSON for a specific kind of data (course grade data).

## CSV
CSV stands for "Comma-Separated Value", and it is used to represent tabular data (like you would find in a spreadsheet). You can find out more on [Wikipedia](https://en.wikipedia.org/wiki/Comma-separated_values).

The particular CSV file that we will work with is similar to the following:

    "ID","Total","Assignment 1","Assignment 2","Exam 1"
    "111278","611","146","128","337"
    "111352","867","227","228","412"
    "111373","461","96","90","275"
    "111305","835","220","217","398"
    "111399","898","226","229","443"
    "111160","454","77","125","252"
    "111276","579","130","111","338"
    "111241","973","236","237","500"

This file represents the grades of eight students (with the given IDs) in a course where there were two assignments and an exam. Notice that the grades listed are represented as strings in the CSV file.
    
## JSON
JSON stands for "JavaScript Object Notation", and it is used as a general-purpose format for many kinds of data. You can find out more on [Wikipedia](https://en.wikipedia.org/wiki/JSON).

The particular JSON file that we will work with is similar to the following:

    {
        "colHeaders":["Total","Assignment 1","Assignment 2","Exam 1"],
        "rowHeaders":["111278","111352","111373","111305","111399","111160","111276","111241"],
        "data":[[611,146,128,337],
                [867,227,228,412],
                [461,96,90,275],
                [835,220,217,398],
                [898,226,229,443],
                [454,77,125,252],
                [579,130,111,338],
                [973,236,237,500]
        ]
    }

This file represents the exact same data as the CSV file above. Notice that the grades in the JSON file are represented as integers instead of strings. Also notice that the "ID" is not listed as a column because that data is given by the "rowHeaders".

## Libraries
You should use [OpenCSV](http://opencsv.sourceforge.net/) (and its [API](http://opencsv.sourceforge.net/apidocs/)) to parse and process the CSV file.

You should use [json-simple](https://code.google.com/archive/p/json-simple/) (and its [examples](https://code.google.com/archive/p/json-simple/wikis)) to parse and process the JSON file.

You do not need to install those libraries. The build file has already been configured so that Gradle will install them automatically if you don't have them. You *will* need to read the documentation and examples, though, in order to see how to use them.,