package com.antaraa.backend.config;

import com.antaraa.backend.model.TarotCard;
import com.antaraa.backend.repository.TarotRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@Component
public class DataSeeder implements CommandLineRunner {

    @Autowired
    private TarotRepository repo;

    @Override
    public void run(String... args) {
        // Purana data asel tar delete kar - navin 78 load karayche
        if (repo.count() != 78) {
            repo.deleteAll();
        } else {
            return;
        }

        List<TarotCard> cards = List.of(
                new TarotCard(1L, "The Fool", "MAJOR", null, "Adventure, innocence", "Foolishness", "freedom", "https://www.sacred-texts.com/tarot/pkt/img/ar00.jpg"),
                new TarotCard(2L, "The Magician", "MAJOR", null, "Power, manifestation", "Manipulation", "willpower", "https://www.sacred-texts.com/tarot/pkt/img/ar01.jpg"),
                new TarotCard(3L, "The High Priestess", "MAJOR", null, "Intuition, mystery", "Secrets", "intuition", "https://www.sacred-texts.com/tarot/pkt/img/ar02.jpg"),
                new TarotCard(4L, "The Empress", "MAJOR", null, "Abundance, nurturing", "Dependence", "abundance", "https://www.sacred-texts.com/tarot/pkt/img/ar03.jpg"),
                new TarotCard(5L, "The Emperor", "MAJOR", null, "Authority, control", "Tyranny", "leadership", "https://www.sacred-texts.com/tarot/pkt/img/ar04.jpg"),
                new TarotCard(6L, "The Hierophant", "MAJOR", null, "Tradition, guidance", "Rebellion", "tradition", "https://www.sacred-texts.com/tarot/pkt/img/ar05.jpg"),
                new TarotCard(7L, "The Lovers", "MAJOR", null, "Love, choices", "Disharmony", "love", "https://www.sacred-texts.com/tarot/pkt/img/ar06.jpg"),
                new TarotCard(8L, "The Chariot", "MAJOR", null, "Victory, willpower", "No direction", "victory", "https://www.sacred-texts.com/tarot/pkt/img/ar07.jpg"),
                new TarotCard(9L, "Strength", "MAJOR", null, "Courage, inner power", "Weakness", "courage", "https://www.sacred-texts.com/tarot/pkt/img/ar08.jpg"),
                new TarotCard(10L, "The Hermit", "MAJOR", null, "Soul searching", "Isolation", "wisdom", "https://www.sacred-texts.com/tarot/pkt/img/ar09.jpg"),
                new TarotCard(11L, "Wheel of Fortune", "MAJOR", null, "Luck, destiny", "Bad luck", "destiny", "https://www.sacred-texts.com/tarot/pkt/img/ar10.jpg"),
                new TarotCard(12L, "Justice", "MAJOR", null, "Fairness, truth", "Unfairness", "justice", "https://www.sacred-texts.com/tarot/pkt/img/ar11.jpg"),
                new TarotCard(13L, "The Hanged Man", "MAJOR", null, "Surrender, perspective", "Stalling", "sacrifice", "https://www.sacred-texts.com/tarot/pkt/img/ar12.jpg"),
                new TarotCard(14L, "Death", "MAJOR", null, "Transformation, endings", "Fear of change", "transformation", "https://www.sacred-texts.com/tarot/pkt/img/ar13.jpg"),
                new TarotCard(15L, "Temperance", "MAJOR", null, "Balance, patience", "Imbalance", "balance", "https://www.sacred-texts.com/tarot/pkt/img/ar14.jpg"),
                new TarotCard(16L, "The Devil", "MAJOR", null, "Bondage, materialism", "Freedom", "shadow", "https://www.sacred-texts.com/tarot/pkt/img/ar15.jpg"),
                new TarotCard(17L, "The Tower", "MAJOR", null, "Awakening, upheaval", "Fear of change", "awakening", "https://www.sacred-texts.com/tarot/pkt/img/ar16.jpg"),
                new TarotCard(18L, "The Star", "MAJOR", null, "Hope, healing", "Hopelessness", "hope", "https://www.sacred-texts.com/tarot/pkt/img/ar17.jpg"),
                new TarotCard(19L, "The Moon", "MAJOR", null, "Intuition, dreams", "Confusion", "intuition", "https://www.sacred-texts.com/tarot/pkt/img/ar18.jpg"),
                new TarotCard(20L, "The Sun", "MAJOR", null, "Joy, success", "Negativity", "joy", "https://www.sacred-texts.com/tarot/pkt/img/ar19.jpg"),
                new TarotCard(21L, "Judgement", "MAJOR", null, "Rebirth, calling", "Self-doubt", "rebirth", "https://www.sacred-texts.com/tarot/pkt/img/ar20.jpg"),
                new TarotCard(22L, "The World", "MAJOR", null, "Completion, travel", "Incompletion", "completion", "https://www.sacred-texts.com/tarot/pkt/img/ar21.jpg"),
                new TarotCard(23L, "Ace of Wands", "MINOR", "Wands", "New energy, spark", "Blocked spark", "creation, wands", "https://www.sacred-texts.com/tarot/pkt/img/waac.jpg"),
                new TarotCard(24L, "Two of Wands", "MINOR", "Wands", "Planning, future", "Fear of future", "planning, wands", "https://www.sacred-texts.com/tarot/pkt/img/wa02.jpg"),
                new TarotCard(25L, "Three of Wands", "MINOR", "Wands", "Expansion, waiting", "Delays", "expansion, wands", "https://www.sacred-texts.com/tarot/pkt/img/wa03.jpg"),
                new TarotCard(26L, "Four of Wands", "MINOR", "Wands", "Celebration, home", "No celebration", "celebration, wands", "https://www.sacred-texts.com/tarot/pkt/img/wa04.jpg"),
                new TarotCard(27L, "Five of Wands", "MINOR", "Wands", "Conflict, competition", "Avoiding conflict", "conflict, wands", "https://www.sacred-texts.com/tarot/pkt/img/wa05.jpg"),
                new TarotCard(28L, "Six of Wands", "MINOR", "Wands", "Victory, success", "No recognition", "victory, wands", "https://www.sacred-texts.com/tarot/pkt/img/wa06.jpg"),
                new TarotCard(29L, "Seven of Wands", "MINOR", "Wands", "Defense, standing ground", "Giving up", "defense, wands", "https://www.sacred-texts.com/tarot/pkt/img/wa07.jpg"),
                new TarotCard(30L, "Eight of Wands", "MINOR", "Wands", "Fast action, speed", "Delays", "speed, wands", "https://www.sacred-texts.com/tarot/pkt/img/wa08.jpg"),
                new TarotCard(31L, "Nine of Wands", "MINOR", "Wands", "Resilience, stamina", "Exhaustion", "resilience, wands", "https://www.sacred-texts.com/tarot/pkt/img/wa09.jpg"),
                new TarotCard(32L, "Ten of Wands", "MINOR", "Wands", "Burden, responsibility", "Releasing burden", "burden, wands", "https://www.sacred-texts.com/tarot/pkt/img/wa10.jpg"),
                new TarotCard(33L, "Page of Wands", "MINOR", "Wands", "Exploration, curiosity", "No ideas", "curiosity, wands", "https://www.sacred-texts.com/tarot/pkt/img/wapa.jpg"),
                new TarotCard(34L, "Knight of Wands", "MINOR", "Wands", "Action, adventure", "Recklessness", "action, wands", "https://www.sacred-texts.com/tarot/pkt/img/wakn.jpg"),
                new TarotCard(35L, "Queen of Wands", "MINOR", "Wands", "Confidence, passion", "Jealousy", "confidence, wands", "https://www.sacred-texts.com/tarot/pkt/img/waqu.jpg"),
                new TarotCard(36L, "King of Wands", "MINOR", "Wands", "Leadership, vision", "Tyranny", "leadership, wands", "https://www.sacred-texts.com/tarot/pkt/img/waki.jpg"),
                new TarotCard(37L, "Ace of Cups", "MINOR", "Cups", "New love, feelings", "Blocked emotions", "love, cups", "https://www.sacred-texts.com/tarot/pkt/img/cuac.jpg"),
                new TarotCard(38L, "Two of Cups", "MINOR", "Cups", "Unity, partnership", "Breakup", "unity, cups", "https://www.sacred-texts.com/tarot/pkt/img/cu02.jpg"),
                new TarotCard(39L, "Three of Cups", "MINOR", "Cups", "Friendship, celebration", "Gossip", "friendship, cups", "https://www.sacred-texts.com/tarot/pkt/img/cu03.jpg"),
                new TarotCard(40L, "Four of Cups", "MINOR", "Cups", "Apathy, contemplation", "New awareness", "apathy, cups", "https://www.sacred-texts.com/tarot/pkt/img/cu04.jpg"),
                new TarotCard(41L, "Five of Cups", "MINOR", "Cups", "Loss, grief", "Moving on", "loss, cups", "https://www.sacred-texts.com/tarot/pkt/img/cu05.jpg"),
                new TarotCard(42L, "Six of Cups", "MINOR", "Cups", "Nostalgia, childhood", "Stuck in past", "nostalgia, cups", "https://www.sacred-texts.com/tarot/pkt/img/cu06.jpg"),
                new TarotCard(43L, "Seven of Cups", "MINOR", "Cups", "Choices, illusion", "Clarity", "choices, cups", "https://www.sacred-texts.com/tarot/pkt/img/cu07.jpg"),
                new TarotCard(44L, "Eight of Cups", "MINOR", "Cups", "Walking away, leaving", "Fear of leaving", "leaving, cups", "https://www.sacred-texts.com/tarot/pkt/img/cu08.jpg"),
                new TarotCard(45L, "Nine of Cups", "MINOR", "Cups", "Wishes fulfilled", "Dissatisfaction", "wishes, cups", "https://www.sacred-texts.com/tarot/pkt/img/cu09.jpg"),
                new TarotCard(46L, "Ten of Cups", "MINOR", "Cups", "Happy family, harmony", "Broken home", "harmony, cups", "https://www.sacred-texts.com/tarot/pkt/img/cu10.jpg"),
                new TarotCard(47L, "Page of Cups", "MINOR", "Cups", "Dreamy, sensitive", "Immature emotions", "dreamy, cups", "https://www.sacred-texts.com/tarot/pkt/img/cupa.jpg"),
                new TarotCard(48L, "Knight of Cups", "MINOR", "Cups", "Romance, charm", "Unrealistic", "romance, cups", "https://www.sacred-texts.com/tarot/pkt/img/cukn.jpg"),
                new TarotCard(49L, "Queen of Cups", "MINOR", "Cups", "Compassion, intuition", "Overly emotional", "compassion, cups", "https://www.sacred-texts.com/tarot/pkt/img/cuqu.jpg"),
                new TarotCard(50L, "King of Cups", "MINOR", "Cups", "Emotional balance", "Emotional coldness", "balance, cups", "https://www.sacred-texts.com/tarot/pkt/img/cuki.jpg"),
                new TarotCard(51L, "Ace of Swords", "MINOR", "Swords", "Clarity, breakthrough", "Confusion", "clarity, swords", "https://www.sacred-texts.com/tarot/pkt/img/swac.jpg"),
                new TarotCard(52L, "Two of Swords", "MINOR", "Swords", "Difficult choice, stalemate", "Indecision", "choice, swords", "https://www.sacred-texts.com/tarot/pkt/img/sw02.jpg"),
                new TarotCard(53L, "Three of Swords", "MINOR", "Swords", "Heartbreak, sorrow", "Healing heartbreak", "heartbreak, swords", "https://www.sacred-texts.com/tarot/pkt/img/sw03.jpg"),
                new TarotCard(54L, "Four of Swords", "MINOR", "Swords", "Rest, recovery", "Burnout", "rest, swords", "https://www.sacred-texts.com/tarot/pkt/img/sw04.jpg"),
                new TarotCard(55L, "Five of Swords", "MINOR", "Swords", "Conflict, winning at cost", "Reconciliation", "conflict, swords", "https://www.sacred-texts.com/tarot/pkt/img/sw05.jpg"),
                new TarotCard(56L, "Six of Swords", "MINOR", "Swords", "Transition, moving on", "Stuck", "transition, swords", "https://www.sacred-texts.com/tarot/pkt/img/sw06.jpg"),
                new TarotCard(57L, "Seven of Swords", "MINOR", "Swords", "Deception, sneaking", "Coming clean", "deception, swords", "https://www.sacred-texts.com/tarot/pkt/img/sw07.jpg"),
                new TarotCard(58L, "Eight of Swords", "MINOR", "Swords", "Feeling trapped", "Freedom", "trapped, swords", "https://www.sacred-texts.com/tarot/pkt/img/sw08.jpg"),
                new TarotCard(59L, "Nine of Swords", "MINOR", "Swords", "Anxiety, nightmares", "Hope", "anxiety, swords", "https://www.sacred-texts.com/tarot/pkt/img/sw09.jpg"),
                new TarotCard(60L, "Ten of Swords", "MINOR", "Swords", "Betrayal, painful end", "Recovery", "betrayal, swords", "https://www.sacred-texts.com/tarot/pkt/img/sw10.jpg"),
                new TarotCard(61L, "Page of Swords", "MINOR", "Swords", "Curiosity, spying", "Gossip", "curiosity, swords", "https://www.sacred-texts.com/tarot/pkt/img/swpa.jpg"),
                new TarotCard(62L, "Knight of Swords", "MINOR", "Swords", "Fast action, ambition", "Recklessness", "ambition, swords", "https://www.sacred-texts.com/tarot/pkt/img/swkn.jpg"),
                new TarotCard(63L, "Queen of Swords", "MINOR", "Swords", "Clear mind, honesty", "Cruelty", "honesty, swords", "https://www.sacred-texts.com/tarot/pkt/img/swqu.jpg"),
                new TarotCard(64L, "King of Swords", "MINOR", "Swords", "Logic, authority", "Manipulation", "logic, swords", "https://www.sacred-texts.com/tarot/pkt/img/swki.jpg"),
                new TarotCard(65L, "Ace of Pentacles", "MINOR", "Pentacles", "New money, opportunity", "Lost opportunity", "opportunity, pentacles", "https://www.sacred-texts.com/tarot/pkt/img/peac.jpg"),
                new TarotCard(66L, "Two of Pentacles", "MINOR", "Pentacles", "Balance, juggling", "Imbalance", "balance, pentacles", "https://www.sacred-texts.com/tarot/pkt/img/pe02.jpg"),
                new TarotCard(67L, "Three of Pentacles", "MINOR", "Pentacles", "Teamwork, skill", "Lack of teamwork", "teamwork, pentacles", "https://www.sacred-texts.com/tarot/pkt/img/pe03.jpg"),
                new TarotCard(68L, "Four of Pentacles", "MINOR", "Pentacles", "Saving, security", "Greed", "security, pentacles", "https://www.sacred-texts.com/tarot/pkt/img/pe04.jpg"),
                new TarotCard(69L, "Five of Pentacles", "MINOR", "Pentacles", "Poverty, worry", "Recovery", "worry, pentacles", "https://www.sacred-texts.com/tarot/pkt/img/pe05.jpg"),
                new TarotCard(70L, "Six of Pentacles", "MINOR", "Pentacles", "Giving, charity", "Debt", "charity, pentacles", "https://www.sacred-texts.com/tarot/pkt/img/pe06.jpg"),
                new TarotCard(71L, "Seven of Pentacles", "MINOR", "Pentacles", "Patience, investment", "Impatience", "patience, pentacles", "https://www.sacred-texts.com/tarot/pkt/img/pe07.jpg"),
                new TarotCard(72L, "Eight of Pentacles", "MINOR", "Pentacles", "Hard work, skill", "Laziness", "skill, pentacles", "https://www.sacred-texts.com/tarot/pkt/img/pe08.jpg"),
                new TarotCard(73L, "Nine of Pentacles", "MINOR", "Pentacles", "Luxury, independence", "Dependence", "luxury, pentacles", "https://www.sacred-texts.com/tarot/pkt/img/pe09.jpg"),
                new TarotCard(74L, "Ten of Pentacles", "MINOR", "Pentacles", "Wealth, family legacy", "Financial failure", "wealth, pentacles", "https://www.sacred-texts.com/tarot/pkt/img/pe10.jpg"),
                new TarotCard(75L, "Page of Pentacles", "MINOR", "Pentacles", "New study, ambition", "No focus", "ambition, pentacles", "https://www.sacred-texts.com/tarot/pkt/img/pepa.jpg"),
                new TarotCard(76L, "Knight of Pentacles", "MINOR", "Pentacles", "Hard work, routine", "Boredom", "routine, pentacles", "https://www.sacred-texts.com/tarot/pkt/img/pekn.jpg"),
                new TarotCard(77L, "Queen of Pentacles", "MINOR", "Pentacles", "Nurturing, practical", "Materialism", "practical, pentacles", "https://www.sacred-texts.com/tarot/pkt/img/pequ.jpg"),
                new TarotCard(78L, "King of Pentacles", "MINOR", "Pentacles", "Wealth, success", "Greed", "success, pentacles", "https://www.sacred-texts.com/tarot/pkt/img/peki.jpg")
        );
        repo.saveAll(cards);
        System.out.println("Antaraa - 78 cards with images loaded!");
    }
}