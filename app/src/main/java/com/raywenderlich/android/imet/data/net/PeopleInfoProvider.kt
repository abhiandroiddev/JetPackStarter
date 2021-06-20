/*
 *
 *  * Copyright (c) 2018 Razeware LLC
 *  *
 *  * Permission is hereby granted, free of charge, to any person obtaining a copy
 *  * of this software and associated documentation files (the "Software"), to deal
 *  * in the Software without restriction, including without limitation the rights
 *  * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  * copies of the Software, and to permit persons to whom the Software is
 *  * furnished to do so, subject to the following conditions:
 *  *
 *  * The above copyright notice and this permission notice shall be included in
 *  * all copies or substantial portions of the Software.
 *  *
 *  * Notwithstanding the foregoing, you may not use, copy, modify, merge, publish,
 *  * distribute, sublicense, create a derivative work, and/or sell copies of the
 *  * Software in any work that is designed, intended, or marketed for pedagogical or
 *  * instructional purposes related to programming, coding, application development,
 *  * or information technology.  Permission for such use, copying, modification,
 *  * merger, publication, distribution, sublicensing, creation of derivative works,
 *  * or sale is expressly withheld.
 *  *
 *  * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 *  * THE SOFTWARE.
 *
 *
 */

package com.raywenderlich.android.imet.data.net

import com.raywenderlich.android.imet.data.model.People

class PeopleInfoProvider {

  companion object {
    var peopleList = initPeopleList()

    /**
     * Initialises peopleList with dummy data
     */
    private fun initPeopleList(): MutableList<People> {
      var peoples = mutableListOf<People>()
      peoples.add(People(
          1,
          "Ray Wenderlich",
          "RW Campus",
           "228-40332240",
          "ray@razeware.com",
          "facebook.com/raywenderlich",
          "twitter.com/rwenderlich"
          ))
      peoples.add(People(
          2,
          "Mark Tremonti",
          "Alter Bridge Concert",
          "228-44012312",
          "mark@alterbridge.com",
          "facebook.com/tremonti",
          "twitter.com/TremontiAB"
          ))
      peoples.add(People(
          3,
          "Jeff Bezos",
          "Amazon HQ",
          "206-26622992",
          "j.bezos@amazon.com",
          "facebook.com/j.bezos",
          "twitter.com/Amazon"
          ))
      peoples.add(People(
          4,
          "Mark Zuckerberg",
          "Facebook",
          "228-41124312",
          "mark@facebook.com",
          "facebook.com/mz",
          "twitter.com/MarkZ"))
      peoples.add(People(
          5,
          "Bil Gates",
          "Microsoft HQ",
          "206-24541837",
          "gates@microsoft.com",
          "facebook.com/b.gates",
          "twitter.com/MicrosoftUS"
          ))
      peoples.add(People(
          6,
          "Tim Cook",
          "Apple, Cupertino",
          "310-27753123",
          "cook@apple.com",
          "facebook.com/t.cook",
          "twitter.com/AppleCA"
          ))
      peoples.add(People(
          7,
          "Sundar Pichai",
          "Google CA",
          "310-46645322",
          "s.pichai@gmail.com",
          "facebook.com/s.pichai",
          "twitter.com/GoogleCEO"
          ))
      peoples.add(People(
          8,
          "Elon Musk",
          "SpaceX Campus",
          "310-35666875",
          "musk@spacex.com",
          "facebook.com/e.musk",
          "twitter.com/SpaceX"
          ))
      return peoples
    }
  }
}
