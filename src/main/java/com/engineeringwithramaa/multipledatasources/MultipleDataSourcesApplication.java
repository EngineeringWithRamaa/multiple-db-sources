package com.engineeringwithramaa.multipledatasources;

import com.engineeringwithramaa.multipledatasources.model.card.Card;
import com.engineeringwithramaa.multipledatasources.model.cardholder.CardHolder;
import com.engineeringwithramaa.multipledatasources.model.member.Member;
import com.engineeringwithramaa.multipledatasources.repository.card.CardRepository;
import com.engineeringwithramaa.multipledatasources.repository.cardholder.CardHolderRepository;
import com.engineeringwithramaa.multipledatasources.repository.member.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Optional;

@SpringBootApplication
@EnableScheduling
public class MultipleDataSourcesApplication {

	public static void main(String[] args)
	{
		SpringApplication.run(MultipleDataSourcesApplication.class, args);

	}

}

@Configuration
@EnableScheduling
class TestClass {
	@Autowired
	private MemberRepository memberRepository;
	@Autowired
	private CardHolderRepository cardHolderRepository;
	@Autowired
	private CardRepository cardRepository;

	@Scheduled(cron="0 42 20 28 05 06")
	public void testingFunction() {
		Member member = new Member(Long.valueOf(1),"ramaa", "M001");
		CardHolder cardHolder = new CardHolder(Long.valueOf(1), "4111111111111111", member.getMemberId());
		Card card = new Card(Long.valueOf(1),01,2025, member.getName());

		Member savedMember =memberRepository.save(member);
		Optional<Member> memberFromDb= memberRepository.findById(savedMember.getId());
		System.out.println(memberFromDb.isPresent());

		CardHolder savedCardHolder =cardHolderRepository.save(cardHolder);
		Optional<CardHolder> cardHolderFromDb= cardHolderRepository.findById(savedCardHolder.getId());
		System.out.println(cardHolderFromDb.isPresent());

		Card savedCard = cardRepository.save(card);
		Optional<Card> cardFromDb= cardRepository.findById(savedCard.getId());
		System.out.println(cardFromDb.isPresent());
	}
}
