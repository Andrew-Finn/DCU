# Assigment 2 -> Andrew Finn - 18XXXXXX

## Usage

- First command line argument -> file to encrypt

K isnt random. I wanted my implementation to have a consistent output so instead os generating a random number I use a
seed and an iterator to generate a pseudorandom K. This is not cryptographically secure as K isnt truly random but this
allows for easier test and visualisation of the solution as the output is consistent and K will regenerate in the event
S is 0. This can not happen with a hardcoded value hence this approach.

## Output:

R:
95DA1D4514F2EFE6A3801EB96A178F7567412A0BF37226C4774D6936ECDBBA9BCA2D08AC3152C926F30DD8C91FFBCDF9383A0C1C0E04B681CDFFAB2FF7345F074794757925FF619B3E63E7D20DE2DF4CBA176CB72E103AE470E1C0126444676D8414EE3F8509EA0E9F2CCF4DD3FE3CF2A0ECA72FCC4C7E2E5BD62F7FF4238968

Y:
6492B07A83CE5611435779AA8A74AD14CB78289C62308BB20F748F326BDDF3DD296A961FDBAD77B88C6F6115F3D7B879BAD3F529612142BFB882B6433302EDB0D5202130FD57761BC974F11F3132B006B29957AEFC142108F45EB5B09F5CFC251AF7DEE6CDEA7D73C5A453E54C78EBC1F6D5F8CBCE8F671D8E808FE50A65046C

S:
B02BABB9273157D66CEB8D2BD536E8A9092D366A2F436D80DB05FEBC9F2FF5E7BB19B7EDA809F199F075ED4E865CBB2FAF94AF36F605946034E35D00FF221664CD4354C72B14ED0A5450E203FFC93F964683F55CACAE20DC152792C192BF3DB4A1A77BF2B74F5DB9B0A33F5A1559952A19EE10DFF66791A4891D1117F44BF8DE

### Run assertion tests:

0 < r < p : true

0 < s < p-1 : true

g^H(m) (mod p) = (y^r)r^s (mod p): true

## Declaration on Plagiarism

Assignment Submission Form

This form must be filled in and completed by the student(s) submitting an assignment

- Name(s): Andrew Finn
- Programme: CASE
- Module Code: CA4005
- Assignment Title: Assigment 2
- Submission Date: 11th November 2021 (Approx)
- Module Coordinator: Dr Geoff Hamilton

I/We declare that this material, which I/We now submit for assessment, is entirely my/our own work and has not been
taken from the work of others, save and to the extent that such work has been cited and acknowledged within the text of
my/our work. I/We understand that plagiarism, collusion, and copying are grave and serious offences in the university
and accept the penalties that would be imposed should I engage in plagiarism, collusion or copying. I/We have read and
understood the Assignment Regulations. I/We have identified and included the source of all facts, ideas, opinions, and
viewpoints of others in the assignment references. Direct quotations from books, journal articles, internet sources,
module text, or any other source whatsoever are acknowledged and the source cited are identified in the assignment
references. This assignment, or any part of it, has not been previously submitted by me/us or any other person for
assessment on this or any other course of study.

I/We have read and understood the referencing guidelines found at
http://www.dcu.ie/info/regulations/plagiarism.shtml , https://www4.dcu.ie/students/az/plagiarism
and/or recommended in the assignment guidelines.

Name(s): **Andrew Finn**  
Date: **11th November 2021**