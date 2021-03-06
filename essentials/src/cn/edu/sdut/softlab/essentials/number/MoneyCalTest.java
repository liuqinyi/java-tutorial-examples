/*
 * Copyright 2016 Su Baochen and individual contributors by the 
 * @authors tag. See the copyright.txt in the distribution for
 * a full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package cn.edu.sdut.softlab.essentials.number;

/**
 * 本类 .
 * @author Su Baochen
 */
public class MoneyCalTest {

  /**
   * 程序执行入口.
   * @param args 命令行参数
   */
  public static void main(String[] args) {
    System.out.println(10.03-4.36);
    
    double funds = 1.00;
    int itemsBought = 0;
    for(double price = .10; funds >= price; price += .10) {
      funds -= price;
      itemsBought++;
    }
    
    System.out.println(itemsBought + " items bought.");
    System.out.println("Change: ￥" + funds);
      
  }

}
