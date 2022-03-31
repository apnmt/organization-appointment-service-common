package de.apnmt.organizationappointment.common.config.dbmigrations;

import com.github.cloudyrock.mongock.ChangeLog;
import com.github.cloudyrock.mongock.ChangeSet;
import com.github.cloudyrock.mongock.driver.mongodb.springdata.v3.decorator.impl.MongockTemplate;
import de.apnmt.organizationappointment.common.domain.Service;


/**
 * Creates the initial database setup.
 */
@ChangeLog(order = "001")
public class InitialServiceMigration {

    @ChangeSet(order = "01", author = "initiator", id = "01-addServices")
    public void addServices(MongockTemplate mongoTemplate) {
        createService(1L, 30, mongoTemplate);
        createService(2L, 15, mongoTemplate);
        createService(3L, 30, mongoTemplate);
        createService(4L, 15, mongoTemplate);
        createService(5L, 30, mongoTemplate);
        createService(6L, 15, mongoTemplate);
        createService(7L, 30, mongoTemplate);
        createService(8L, 15, mongoTemplate);
        createService(9L, 30, mongoTemplate);
        createService(10L, 15, mongoTemplate);
        createService(11L, 30, mongoTemplate);
        createService(12L, 15, mongoTemplate);
        createService(13L, 30, mongoTemplate);
        createService(14L, 15, mongoTemplate);
        createService(15L, 30, mongoTemplate);
        createService(16L, 15, mongoTemplate);
        createService(17L, 30, mongoTemplate);
        createService(18L, 15, mongoTemplate);
        createService(19L, 30, mongoTemplate);
        createService(20L, 15, mongoTemplate);
        createService(21L, 30, mongoTemplate);
        createService(22L, 15, mongoTemplate);
        createService(23L, 30, mongoTemplate);
        createService(24L, 15, mongoTemplate);
        createService(25L, 30, mongoTemplate);
        createService(26L, 15, mongoTemplate);
        createService(27L, 30, mongoTemplate);
        createService(28L, 15, mongoTemplate);
        createService(29L, 30, mongoTemplate);
        createService(30L, 15, mongoTemplate);
        createService(31L, 30, mongoTemplate);
        createService(32L, 15, mongoTemplate);
        createService(33L, 30, mongoTemplate);
        createService(34L, 15, mongoTemplate);
        createService(35L, 30, mongoTemplate);
        createService(36L, 15, mongoTemplate);
        createService(37L, 30, mongoTemplate);
        createService(38L, 15, mongoTemplate);
        createService(39L, 30, mongoTemplate);
        createService(40L, 15, mongoTemplate);
        createService(41L, 30, mongoTemplate);
        createService(42L, 15, mongoTemplate);
        createService(43L, 30, mongoTemplate);
        createService(44L, 15, mongoTemplate);
        createService(45L, 30, mongoTemplate);
        createService(46L, 15, mongoTemplate);
        createService(47L, 30, mongoTemplate);
        createService(48L, 15, mongoTemplate);
        createService(49L, 30, mongoTemplate);
        createService(50L, 15, mongoTemplate);
        createService(51L, 30, mongoTemplate);
        createService(52L, 15, mongoTemplate);
        createService(53L, 30, mongoTemplate);
        createService(54L, 15, mongoTemplate);
        createService(55L, 30, mongoTemplate);
        createService(56L, 15, mongoTemplate);
        createService(57L, 30, mongoTemplate);
        createService(58L, 15, mongoTemplate);
        createService(59L, 30, mongoTemplate);
        createService(60L, 15, mongoTemplate);
        createService(61L, 30, mongoTemplate);
        createService(62L, 15, mongoTemplate);
        createService(63L, 30, mongoTemplate);
        createService(64L, 15, mongoTemplate);
        createService(65L, 30, mongoTemplate);
        createService(66L, 15, mongoTemplate);
        createService(67L, 30, mongoTemplate);
        createService(68L, 15, mongoTemplate);
        createService(69L, 30, mongoTemplate);
        createService(70L, 15, mongoTemplate);
        createService(71L, 30, mongoTemplate);
        createService(72L, 15, mongoTemplate);
        createService(73L, 30, mongoTemplate);
        createService(74L, 15, mongoTemplate);
        createService(75L, 30, mongoTemplate);
        createService(76L, 15, mongoTemplate);
        createService(77L, 30, mongoTemplate);
        createService(78L, 15, mongoTemplate);
        createService(79L, 30, mongoTemplate);
        createService(80L, 15, mongoTemplate);
        createService(81L, 30, mongoTemplate);
        createService(82L, 15, mongoTemplate);
        createService(83L, 30, mongoTemplate);
        createService(84L, 15, mongoTemplate);
        createService(85L, 30, mongoTemplate);
        createService(86L, 15, mongoTemplate);
        createService(87L, 30, mongoTemplate);
        createService(88L, 15, mongoTemplate);
        createService(89L, 30, mongoTemplate);
        createService(90L, 15, mongoTemplate);
        createService(91L, 30, mongoTemplate);
        createService(92L, 15, mongoTemplate);
        createService(93L, 30, mongoTemplate);
        createService(94L, 15, mongoTemplate);
        createService(95L, 30, mongoTemplate);
        createService(96L, 15, mongoTemplate);
        createService(97L, 30, mongoTemplate);
        createService(98L, 15, mongoTemplate);
        createService(99L, 30, mongoTemplate);
        createService(100L, 15, mongoTemplate);
        createService(101L, 30, mongoTemplate);
        createService(102L, 15, mongoTemplate);
        createService(103L, 30, mongoTemplate);
        createService(104L, 15, mongoTemplate);
        createService(105L, 30, mongoTemplate);
        createService(106L, 15, mongoTemplate);
        createService(107L, 30, mongoTemplate);
        createService(108L, 15, mongoTemplate);
        createService(109L, 30, mongoTemplate);
        createService(110L, 15, mongoTemplate);
        createService(111L, 30, mongoTemplate);
        createService(112L, 15, mongoTemplate);
        createService(113L, 30, mongoTemplate);
        createService(114L, 15, mongoTemplate);
        createService(115L, 30, mongoTemplate);
        createService(116L, 15, mongoTemplate);
        createService(117L, 30, mongoTemplate);
        createService(118L, 15, mongoTemplate);
        createService(119L, 30, mongoTemplate);
        createService(120L, 15, mongoTemplate);
        createService(121L, 30, mongoTemplate);
        createService(122L, 15, mongoTemplate);
        createService(123L, 30, mongoTemplate);
        createService(124L, 15, mongoTemplate);
        createService(125L, 30, mongoTemplate);
        createService(126L, 15, mongoTemplate);
        createService(127L, 30, mongoTemplate);
        createService(128L, 15, mongoTemplate);
        createService(129L, 30, mongoTemplate);
        createService(130L, 15, mongoTemplate);
        createService(131L, 30, mongoTemplate);
        createService(132L, 15, mongoTemplate);
        createService(133L, 30, mongoTemplate);
        createService(134L, 15, mongoTemplate);
        createService(135L, 30, mongoTemplate);
        createService(136L, 15, mongoTemplate);
        createService(137L, 30, mongoTemplate);
        createService(138L, 15, mongoTemplate);
        createService(139L, 30, mongoTemplate);
        createService(140L, 15, mongoTemplate);
        createService(141L, 30, mongoTemplate);
        createService(142L, 15, mongoTemplate);
        createService(143L, 30, mongoTemplate);
        createService(144L, 15, mongoTemplate);
        createService(145L, 30, mongoTemplate);
        createService(146L, 15, mongoTemplate);
        createService(147L, 30, mongoTemplate);
        createService(148L, 15, mongoTemplate);
        createService(149L, 30, mongoTemplate);
        createService(150L, 15, mongoTemplate);
        createService(151L, 30, mongoTemplate);
        createService(152L, 15, mongoTemplate);
        createService(153L, 30, mongoTemplate);
        createService(154L, 15, mongoTemplate);
        createService(155L, 30, mongoTemplate);
        createService(156L, 15, mongoTemplate);
        createService(157L, 30, mongoTemplate);
        createService(158L, 15, mongoTemplate);
        createService(159L, 30, mongoTemplate);
        createService(160L, 15, mongoTemplate);
        createService(161L, 30, mongoTemplate);
        createService(162L, 15, mongoTemplate);
        createService(163L, 30, mongoTemplate);
        createService(164L, 15, mongoTemplate);
        createService(165L, 30, mongoTemplate);
        createService(166L, 15, mongoTemplate);
        createService(167L, 30, mongoTemplate);
        createService(168L, 15, mongoTemplate);
        createService(169L, 30, mongoTemplate);
        createService(170L, 15, mongoTemplate);
        createService(171L, 30, mongoTemplate);
        createService(172L, 15, mongoTemplate);
        createService(173L, 30, mongoTemplate);
        createService(174L, 15, mongoTemplate);
        createService(175L, 30, mongoTemplate);
        createService(176L, 15, mongoTemplate);
        createService(177L, 30, mongoTemplate);
        createService(178L, 15, mongoTemplate);
        createService(179L, 30, mongoTemplate);
        createService(180L, 15, mongoTemplate);
        createService(181L, 30, mongoTemplate);
        createService(182L, 15, mongoTemplate);
        createService(183L, 30, mongoTemplate);
        createService(184L, 15, mongoTemplate);
        createService(185L, 30, mongoTemplate);
        createService(186L, 15, mongoTemplate);
        createService(187L, 30, mongoTemplate);
        createService(188L, 15, mongoTemplate);
        createService(189L, 30, mongoTemplate);
        createService(190L, 15, mongoTemplate);
        createService(191L, 30, mongoTemplate);
        createService(192L, 15, mongoTemplate);
        createService(193L, 30, mongoTemplate);
        createService(194L, 15, mongoTemplate);
        createService(195L, 30, mongoTemplate);
        createService(196L, 15, mongoTemplate);
        createService(197L, 30, mongoTemplate);
        createService(198L, 15, mongoTemplate);
        createService(199L, 30, mongoTemplate);
        createService(200L, 15, mongoTemplate);
        createService(201L, 30, mongoTemplate);
        createService(202L, 15, mongoTemplate);
        createService(203L, 30, mongoTemplate);
        createService(204L, 15, mongoTemplate);
        createService(205L, 30, mongoTemplate);
        createService(206L, 15, mongoTemplate);
        createService(207L, 30, mongoTemplate);
        createService(208L, 15, mongoTemplate);
        createService(209L, 30, mongoTemplate);
        createService(210L, 15, mongoTemplate);
        createService(211L, 30, mongoTemplate);
        createService(212L, 15, mongoTemplate);
        createService(213L, 30, mongoTemplate);
        createService(214L, 15, mongoTemplate);
        createService(215L, 30, mongoTemplate);
        createService(216L, 15, mongoTemplate);
        createService(217L, 30, mongoTemplate);
        createService(218L, 15, mongoTemplate);
        createService(219L, 30, mongoTemplate);
        createService(220L, 15, mongoTemplate);
        createService(221L, 30, mongoTemplate);
        createService(222L, 15, mongoTemplate);
        createService(223L, 30, mongoTemplate);
        createService(224L, 15, mongoTemplate);
        createService(225L, 30, mongoTemplate);
        createService(226L, 15, mongoTemplate);
        createService(227L, 30, mongoTemplate);
        createService(228L, 15, mongoTemplate);
        createService(229L, 30, mongoTemplate);
        createService(230L, 15, mongoTemplate);
        createService(231L, 30, mongoTemplate);
        createService(232L, 15, mongoTemplate);
        createService(233L, 30, mongoTemplate);
        createService(234L, 15, mongoTemplate);
        createService(235L, 30, mongoTemplate);
        createService(236L, 15, mongoTemplate);
        createService(237L, 30, mongoTemplate);
        createService(238L, 15, mongoTemplate);
        createService(239L, 30, mongoTemplate);
        createService(240L, 15, mongoTemplate);
        createService(241L, 30, mongoTemplate);
        createService(242L, 15, mongoTemplate);
        createService(243L, 30, mongoTemplate);
        createService(244L, 15, mongoTemplate);
        createService(245L, 30, mongoTemplate);
        createService(246L, 15, mongoTemplate);
        createService(247L, 30, mongoTemplate);
        createService(248L, 15, mongoTemplate);
        createService(249L, 30, mongoTemplate);
        createService(250L, 15, mongoTemplate);
        createService(251L, 30, mongoTemplate);
        createService(252L, 15, mongoTemplate);
        createService(253L, 30, mongoTemplate);
        createService(254L, 15, mongoTemplate);
        createService(255L, 30, mongoTemplate);
        createService(256L, 15, mongoTemplate);
        createService(257L, 30, mongoTemplate);
        createService(258L, 15, mongoTemplate);
        createService(259L, 30, mongoTemplate);
        createService(260L, 15, mongoTemplate);
        createService(261L, 30, mongoTemplate);
        createService(262L, 15, mongoTemplate);
        createService(263L, 30, mongoTemplate);
        createService(264L, 15, mongoTemplate);
        createService(265L, 30, mongoTemplate);
        createService(266L, 15, mongoTemplate);
        createService(267L, 30, mongoTemplate);
        createService(268L, 15, mongoTemplate);
        createService(269L, 30, mongoTemplate);
        createService(270L, 15, mongoTemplate);
        createService(271L, 30, mongoTemplate);
        createService(272L, 15, mongoTemplate);
        createService(273L, 30, mongoTemplate);
        createService(274L, 15, mongoTemplate);
        createService(275L, 30, mongoTemplate);
        createService(276L, 15, mongoTemplate);
        createService(277L, 30, mongoTemplate);
        createService(278L, 15, mongoTemplate);
        createService(279L, 30, mongoTemplate);
        createService(280L, 15, mongoTemplate);
        createService(281L, 30, mongoTemplate);
        createService(282L, 15, mongoTemplate);
        createService(283L, 30, mongoTemplate);
        createService(284L, 15, mongoTemplate);
        createService(285L, 30, mongoTemplate);
        createService(286L, 15, mongoTemplate);
        createService(287L, 30, mongoTemplate);
        createService(288L, 15, mongoTemplate);
        createService(289L, 30, mongoTemplate);
        createService(290L, 15, mongoTemplate);
        createService(291L, 30, mongoTemplate);
        createService(292L, 15, mongoTemplate);
        createService(293L, 30, mongoTemplate);
        createService(294L, 15, mongoTemplate);
        createService(295L, 30, mongoTemplate);
        createService(296L, 15, mongoTemplate);
        createService(297L, 30, mongoTemplate);
        createService(298L, 15, mongoTemplate);
        createService(299L, 30, mongoTemplate);
        createService(300L, 15, mongoTemplate);
        createService(301L, 30, mongoTemplate);
        createService(302L, 15, mongoTemplate);
        createService(303L, 30, mongoTemplate);
        createService(304L, 15, mongoTemplate);
        createService(305L, 30, mongoTemplate);
        createService(306L, 15, mongoTemplate);
        createService(307L, 30, mongoTemplate);
        createService(308L, 15, mongoTemplate);
        createService(309L, 30, mongoTemplate);
        createService(310L, 15, mongoTemplate);
        createService(311L, 30, mongoTemplate);
        createService(312L, 15, mongoTemplate);
        createService(313L, 30, mongoTemplate);
        createService(314L, 15, mongoTemplate);
        createService(315L, 30, mongoTemplate);
        createService(316L, 15, mongoTemplate);
        createService(317L, 30, mongoTemplate);
        createService(318L, 15, mongoTemplate);
        createService(319L, 30, mongoTemplate);
        createService(320L, 15, mongoTemplate);
        createService(321L, 30, mongoTemplate);
        createService(322L, 15, mongoTemplate);
        createService(323L, 30, mongoTemplate);
        createService(324L, 15, mongoTemplate);
        createService(325L, 30, mongoTemplate);
        createService(326L, 15, mongoTemplate);
        createService(327L, 30, mongoTemplate);
        createService(328L, 15, mongoTemplate);
        createService(329L, 30, mongoTemplate);
        createService(330L, 15, mongoTemplate);
        createService(331L, 30, mongoTemplate);
        createService(332L, 15, mongoTemplate);
        createService(333L, 30, mongoTemplate);
        createService(334L, 15, mongoTemplate);
        createService(335L, 30, mongoTemplate);
        createService(336L, 15, mongoTemplate);
        createService(337L, 30, mongoTemplate);
        createService(338L, 15, mongoTemplate);
        createService(339L, 30, mongoTemplate);
        createService(340L, 15, mongoTemplate);
        createService(341L, 30, mongoTemplate);
        createService(342L, 15, mongoTemplate);
        createService(343L, 30, mongoTemplate);
        createService(344L, 15, mongoTemplate);
        createService(345L, 30, mongoTemplate);
        createService(346L, 15, mongoTemplate);
        createService(347L, 30, mongoTemplate);
        createService(348L, 15, mongoTemplate);
        createService(349L, 30, mongoTemplate);
        createService(350L, 15, mongoTemplate);
        createService(351L, 30, mongoTemplate);
        createService(352L, 15, mongoTemplate);
        createService(353L, 30, mongoTemplate);
        createService(354L, 15, mongoTemplate);
        createService(355L, 30, mongoTemplate);
        createService(356L, 15, mongoTemplate);
        createService(357L, 30, mongoTemplate);
        createService(358L, 15, mongoTemplate);
        createService(359L, 30, mongoTemplate);
        createService(360L, 15, mongoTemplate);
        createService(361L, 30, mongoTemplate);
        createService(362L, 15, mongoTemplate);
        createService(363L, 30, mongoTemplate);
        createService(364L, 15, mongoTemplate);
        createService(365L, 30, mongoTemplate);
        createService(366L, 15, mongoTemplate);
        createService(367L, 30, mongoTemplate);
        createService(368L, 15, mongoTemplate);
        createService(369L, 30, mongoTemplate);
        createService(370L, 15, mongoTemplate);
        createService(371L, 30, mongoTemplate);
        createService(372L, 15, mongoTemplate);
        createService(373L, 30, mongoTemplate);
        createService(374L, 15, mongoTemplate);
        createService(375L, 30, mongoTemplate);
        createService(376L, 15, mongoTemplate);
        createService(377L, 30, mongoTemplate);
        createService(378L, 15, mongoTemplate);
        createService(379L, 30, mongoTemplate);
        createService(380L, 15, mongoTemplate);
        createService(381L, 30, mongoTemplate);
        createService(382L, 15, mongoTemplate);
        createService(383L, 30, mongoTemplate);
        createService(384L, 15, mongoTemplate);
        createService(385L, 30, mongoTemplate);
        createService(386L, 15, mongoTemplate);
        createService(387L, 30, mongoTemplate);
        createService(388L, 15, mongoTemplate);
        createService(389L, 30, mongoTemplate);
        createService(390L, 15, mongoTemplate);
        createService(391L, 30, mongoTemplate);
        createService(392L, 15, mongoTemplate);
        createService(393L, 30, mongoTemplate);
        createService(394L, 15, mongoTemplate);
        createService(395L, 30, mongoTemplate);
        createService(396L, 15, mongoTemplate);
        createService(397L, 30, mongoTemplate);
        createService(398L, 15, mongoTemplate);
        createService(399L, 30, mongoTemplate);
        createService(400L, 15, mongoTemplate);
        createService(401L, 30, mongoTemplate);
        createService(402L, 15, mongoTemplate);
        createService(403L, 30, mongoTemplate);
        createService(404L, 15, mongoTemplate);
        createService(405L, 30, mongoTemplate);
        createService(406L, 15, mongoTemplate);
        createService(407L, 30, mongoTemplate);
        createService(408L, 15, mongoTemplate);
        createService(409L, 30, mongoTemplate);
        createService(410L, 15, mongoTemplate);
        createService(411L, 30, mongoTemplate);
        createService(412L, 15, mongoTemplate);
        createService(413L, 30, mongoTemplate);
        createService(414L, 15, mongoTemplate);
        createService(415L, 30, mongoTemplate);
        createService(416L, 15, mongoTemplate);
        createService(417L, 30, mongoTemplate);
        createService(418L, 15, mongoTemplate);
        createService(419L, 30, mongoTemplate);
        createService(420L, 15, mongoTemplate);
        createService(421L, 30, mongoTemplate);
        createService(422L, 15, mongoTemplate);
        createService(423L, 30, mongoTemplate);
        createService(424L, 15, mongoTemplate);
        createService(425L, 30, mongoTemplate);
        createService(426L, 15, mongoTemplate);
        createService(427L, 30, mongoTemplate);
        createService(428L, 15, mongoTemplate);
        createService(429L, 30, mongoTemplate);
        createService(430L, 15, mongoTemplate);
        createService(431L, 30, mongoTemplate);
        createService(432L, 15, mongoTemplate);
        createService(433L, 30, mongoTemplate);
        createService(434L, 15, mongoTemplate);
        createService(435L, 30, mongoTemplate);
        createService(436L, 15, mongoTemplate);
        createService(437L, 30, mongoTemplate);
        createService(438L, 15, mongoTemplate);
        createService(439L, 30, mongoTemplate);
        createService(440L, 15, mongoTemplate);
        createService(441L, 30, mongoTemplate);
        createService(442L, 15, mongoTemplate);
        createService(443L, 30, mongoTemplate);
        createService(444L, 15, mongoTemplate);
        createService(445L, 30, mongoTemplate);
        createService(446L, 15, mongoTemplate);
        createService(447L, 30, mongoTemplate);
        createService(448L, 15, mongoTemplate);
        createService(449L, 30, mongoTemplate);
        createService(450L, 15, mongoTemplate);
        createService(451L, 30, mongoTemplate);
        createService(452L, 15, mongoTemplate);
        createService(453L, 30, mongoTemplate);
        createService(454L, 15, mongoTemplate);
        createService(455L, 30, mongoTemplate);
        createService(456L, 15, mongoTemplate);
        createService(457L, 30, mongoTemplate);
        createService(458L, 15, mongoTemplate);
        createService(459L, 30, mongoTemplate);
        createService(460L, 15, mongoTemplate);
        createService(461L, 30, mongoTemplate);
        createService(462L, 15, mongoTemplate);
        createService(463L, 30, mongoTemplate);
        createService(464L, 15, mongoTemplate);
        createService(465L, 30, mongoTemplate);
        createService(466L, 15, mongoTemplate);
        createService(467L, 30, mongoTemplate);
        createService(468L, 15, mongoTemplate);
        createService(469L, 30, mongoTemplate);
        createService(470L, 15, mongoTemplate);
        createService(471L, 30, mongoTemplate);
        createService(472L, 15, mongoTemplate);
        createService(473L, 30, mongoTemplate);
        createService(474L, 15, mongoTemplate);
        createService(475L, 30, mongoTemplate);
        createService(476L, 15, mongoTemplate);
        createService(477L, 30, mongoTemplate);
        createService(478L, 15, mongoTemplate);
        createService(479L, 30, mongoTemplate);
        createService(480L, 15, mongoTemplate);
        createService(481L, 30, mongoTemplate);
        createService(482L, 15, mongoTemplate);
        createService(483L, 30, mongoTemplate);
        createService(484L, 15, mongoTemplate);
        createService(485L, 30, mongoTemplate);
        createService(486L, 15, mongoTemplate);
        createService(487L, 30, mongoTemplate);
        createService(488L, 15, mongoTemplate);
        createService(489L, 30, mongoTemplate);
        createService(490L, 15, mongoTemplate);
        createService(491L, 30, mongoTemplate);
        createService(492L, 15, mongoTemplate);
        createService(493L, 30, mongoTemplate);
        createService(494L, 15, mongoTemplate);
        createService(495L, 30, mongoTemplate);
        createService(496L, 15, mongoTemplate);
        createService(497L, 30, mongoTemplate);
        createService(498L, 15, mongoTemplate);
        createService(499L, 30, mongoTemplate);
        createService(500L, 15, mongoTemplate);
        createService(501L, 30, mongoTemplate);
        createService(502L, 15, mongoTemplate);
    }

    private void createService(Long id, int duration, MongockTemplate mongoTemplate) {
        Service service = new Service();
        service.setId(id);
        service.setDuration(duration);
        mongoTemplate.save(service);
    }
}
