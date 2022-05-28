package com.engineeringwithramaa.multipledatasources;

import com.engineeringwithramaa.multipledatasources.model.card.Card;
import com.engineeringwithramaa.multipledatasources.model.cardholder.CardHolder;
import com.engineeringwithramaa.multipledatasources.model.member.Member;
import com.engineeringwithramaa.multipledatasources.repository.card.CardRepository;
import com.engineeringwithramaa.multipledatasources.repository.cardholder.CardHolderRepository;
import com.engineeringwithramaa.multipledatasources.repository.member.MemberRepository;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
class MultipleDataSourcesApplicationTests {
	@Autowired
	private MemberRepository memberRepository;
	@Autowired
	private CardHolderRepository cardHolderRepository;
	@Autowired
	private CardRepository cardRepository;
	private Member member;
	private Card card;
	private CardHolder cardHolder;
	@Before
	public void initializeDataObjects(){
		member = new Member(Long.valueOf(1),"ramaa", "M001");
		cardHolder = new CardHolder(Long.valueOf(1), "4111111111111111", member.getMemberId());
		card = new Card(Long.valueOf(1),01,2025, member.getName());
	}

	@Test
	public void firstTest(){
		assertTrue(true);
	}
}
