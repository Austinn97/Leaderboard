## Acceptance Tests

| *Setting* | *Value*                   |
| Library   | keywords.GamegogyKeywords |
    
| *Variable*         | *Value*                                 |
| ${f01stu_expected} | [111128] Maritza Abbott mabbott@jsu.edu |
| ${f01crs_expected} | [99018] Spring 2014 (16 students)       |

| *Test Case*                      | *Action*                          | *Argument*              | *Argument* |
| Test Gamegogy Load Student Data  | Start Gamegogy CLI With Arguments | student                 | 111128     |
|                                  | ${output}=                        | Get Command Line Output |            |
|                                  | Should Be Equal                   | ${f01stu_expected}      | ${output}  |
| Test Gamegogy Load Course Data   | Start Gamegogy CLI With Arguments | course                  | 99018      |
|                                  | ${output}=                        | Get Command Line Output |            |
|                                  | Should Be Equal                   | ${f01crs_expected}      | ${output}  |
| Test Gamegogy With No Arguments  | Start Gamegogy CLI With Arguments |                         |            |
|                                  | ${output}=                        | Get Command Line Output |            |
|                                  | Should Be Equal                   |                         | ${output}  |
