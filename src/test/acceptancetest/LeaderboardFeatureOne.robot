## Acceptance Tests

| *Setting* | *Value*                   |
| Library   | keywords.LeaderboardKeywords |
    
| *Variable*         | *Value*                                 |
| ${f01stu_expected} | [111128] Maritza Abbott mabbott@jsu.edu |
| ${f01crs_expected} | [99018] Spring 2014 (16 students)       |

| *Test Case*                      | *Action*                          | *Argument*              | *Argument* |
| Test Leaderboard Load Student Data  | Start Leaderboard CLI With Arguments | student                 | 111128     |
|                                  | ${output}=                        | Get Command Line Output |            |
|                                  | Should Be Equal                   | ${f01stu_expected}      | ${output}  |
| Test Leaderboard Load Course Data   | Start Leaderboard CLI With Arguments | course                  | 99018      |
|                                  | ${output}=                        | Get Command Line Output |            |
|                                  | Should Be Equal                   | ${f01crs_expected}      | ${output}  |
| Test Leaderboard With No Arguments  | Start Leaderboard CLI With Arguments |                         |            |
|                                  | ${output}=                        | Get Command Line Output |            |
|                                  | Should Be Equal                   |                         | ${output}  |
