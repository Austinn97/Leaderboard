## Acceptance Tests

| *Setting* | *Value*                   |
| Library   | SwingLibrary              |

| *Test Case*                      | *Action*                          | *Argument*                       | *Argument*          |
| Test Leaderboard Default Values     | Start Application                 | edu.jsu.mcis.Leaderboard   |                     |
|                                  | Select Window                     | Leaderboard                         |                     |
|                                  | ${courseId}=                      | Get Selected Item From Combo Box	| courseComboBox      |
|                                  | Should Be Equal                   | 99000                            | ${courseId}         |
|                                  | ${columnName}=                    | Get Selected Item From Combo Box | columnComboBox      |
|                                  | Should Be Equal                   | Total                            | ${columnName}       |
|                                  | Label Text Should Be              | courseTerm                       | Term: Spring 2013         |
|                                  | Label Text Should Be              | courseEnrollment                 | Enrollment: 11                  |
|                                  | Label Text Should Be              | studentId                        | Id: 111318              |
|                                  | Label Text Should Be              | studentName                      | Name: Cathleen Guzman     |
|                                  | Label Text Should Be              | studentEmail                     | Email: cguzman@jsu.edu     |
|                                  | Label Text Should Be              | studentScore                     | Score: 925.0               |
|                                  | Close Window                      | Leaderboard                         |                     |
| Test Leaderboard Course Select      | Start Application                 | edu.jsu.mcis.Leaderboard   |                     |
|                                  | Select Window                     | Leaderboard                         |                     |
|                                  | Select From Combo Box             | courseComboBox                   | 7                   |
|                                  | Select From Combo Box             | columnComboBox                   | 0                   |
|                                  | ${columnName}=                    | Get Selected Item From Combo Box | columnComboBox      |
|                                  | Should Be Equal                   | Total                            | ${columnName}       |
|                                  | Label Text Should Be              | courseTerm                       | Term: Spring 2012         |
|                                  | Label Text Should Be              | courseEnrollment                 | Enrollment: 7                   |
|                                  | Label Text Should Be              | studentId                        | Id: 111382              |
|                                  | Label Text Should Be              | studentName                      | Name: Mauricio Harrington |
|                                  | Label Text Should Be              | studentEmail                     | Email: mharrington@jsu.edu |
|                                  | Label Text Should Be              | studentScore                     | Score: 803.0               |
|                                  | Close Window                      | Leaderboard                         |                     |
| Test Leaderboard Column Select      | Start Application                 | edu.jsu.mcis.Leaderboard   |                     |
|                                  | Select Window                     | Leaderboard                         |                     |
|                                  | Select From Combo Box             | courseComboBox                   | 9                   |
|                                  | Select From Combo Box             | columnComboBox                   | Assignment 7        |
|                                  | Label Text Should Be              | courseTerm                       | Term: Spring 2012         |
|                                  | Label Text Should Be              | courseEnrollment                 | Enrollment: 25                  |
|                                  | Label Text Should Be              | studentId                        | Id: 111122              |
|                                  | Label Text Should Be              | studentName                      | Name: Vance McClain       |
|                                  | Label Text Should Be              | studentEmail                     | Email: vmcclain@jsu.edu    |
|                                  | Label Text Should Be              | studentScore                     | Score: 59.0                |
|                                  | Close Window                      | Leaderboard                         |                     |