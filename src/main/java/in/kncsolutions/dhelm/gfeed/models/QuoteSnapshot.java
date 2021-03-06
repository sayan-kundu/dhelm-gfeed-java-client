/**
*Copyright 2018 Knc Solutions Private Limited
*
*Licensed under the Apache License, Version 2.0 (the "License");
*you may not use this file except in compliance with the License.
*You may obtain a copy of the License at
*
*http://www.apache.org/licenses/LICENSE-2.0
*
*Unless required by applicable law or agreed to in writing, software
*distributed under the License is distributed on an "AS IS" BASIS,
*WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
*See the License for the specific language governing permissions and
*limitations under the License.
*/
package in.kncsolutions.dhelm.gfeed.models;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.google.gson.annotations.SerializedName;

public class QuoteSnapshot {
	@SerializedName("Exchange")
    public String exchange;
    @SerializedName("InstrumentIdentifier")  
    public String instrumentIdentifier;
    @SerializedName("LastTradeTime")
    public long lastTradeTime;
	@SerializedName("TradedQty")
    public int tradedQty;
	@SerializedName("OpenInterest")
    public double openInterest;
    @SerializedName("Open")
    public double open;
    @SerializedName("Close")
    public double close;
    @SerializedName("High")
    public double high;
    @SerializedName("Low")
    public double low;
    /**
   	 *@return Returns last traded date-time. 
   	 */
   	public String getLastTradedTime() {
   		Date date = new Date(this.lastTradeTime*1000L); 
   		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss"); 
   		sdf.setTimeZone(java.util.TimeZone.getTimeZone("GMT+5:30")); 
   		String formattedDate = sdf.format(date);
   		return formattedDate;
   	}
   	@Override
	public String toString() {
		return "Exchange : "+this.exchange+"\n"+
				"InstrumentIdentifier : "+this.instrumentIdentifier+"\n"+
				"LastTradeTime : "+this.getLastTradedTime()+"\n"+
				"Close : "+this.close+"\n"+
				"High : "+this.high+"\n"+
				"Low : "+this.low+"\n"+
				"Open : "+this.open+"\n"+
				"TradedQty : "+this.tradedQty+"\n"+
				"OpenInterest : "+this.openInterest+"\n";
				
	}
}
