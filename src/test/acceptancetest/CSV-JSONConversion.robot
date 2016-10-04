| *Setting* | *Value*                    |
| Library   | OperatingSystem            |
| Library   | keywords.ConverterKeywords |

| *Test Case*                         | *Action*        | *Argument*             | *Argument*                     | *Argument* |
| CSV to JSON to CSV Yields Original  | ${contents}=    | Get File               | src/test/resources/grades.csv  |            |
|                                     | ${json}=        | Convert To Json        | ${contents}                    |            |
|                                     | ${csv}=         | Convert To Csv         | ${json}                        |            |
|                                     | Should Be Equal | ${contents}            | ${csv}                         |            |
| JSON to CSV to JSON Yields Original | ${contents}=    | Get File               | src/test/resources/grades.json |            |
|                                     | ${csv}=         | Convert To Csv         | ${contents}                    |            |
|                                     | ${json}=        | Convert To Json        | ${csv}                         |            |
|                                     | ${same}=        | Json Strings Are Equal | ${contents}                    | ${json}    |
|                                     | Should Be True  | ${same}                |                                |            |
