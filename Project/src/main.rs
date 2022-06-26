use std::collections::HashMap;
struct Solution {}
impl Solution {
    pub fn roman_to_int(s: String) -> i32 {
        let mut roman_values:HashMap<char,i32> = HashMap::new();
        roman_values.insert('I',1);
        roman_values.insert('V',5);
        roman_values.insert('X',10);
        roman_values.insert('L',50);
        roman_values.insert('C',100);
        roman_values.insert('D',500);
        roman_values.insert('M',1000);
        let mut roman:i32 = 0;
        s.chars().rev().into_iter().for_each(|character:char| {
            let char_val:&i32 = roman_values.get(&character).unwrap();
            if 4 * char_val > roman {
                roman+=char_val;
            }
            else {
                roman-=char_val;
            }
        });
        return roman;
    }
}
fn main() {
    println!("{:?}",Solution::roman_to_int(String::from("I"))); //PS:: you will get error if you provide an string that contains a non-roman value
}
