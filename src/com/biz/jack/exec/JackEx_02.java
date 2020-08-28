package com.biz.jack.exec;

import java.util.List;

import com.biz.jack.domain.DeckVO;
import com.biz.jack.service.DeckServiceV1;
import com.biz.jack.service.PlayerServiceV1;

public class JackEx_02 {
public static void main(String[] args) {
	DeckServiceV1 ds = new DeckServiceV1();
	
	ds.makeDeck();
	List<DeckVO> deckList = ds.getDeck(); 
	
	PlayerServiceV1 딜러 = new PlayerServiceV1(deckList);
	PlayerServiceV1 애치 = new PlayerServiceV1(deckList, "애치");
	
	딜러.hit();
	애치.hit();
	
	딜러.hit();
	애치.hit();
	
	if(딜러.sumValue() < 17) 딜러.hit();
	애치.hit();
}
}
