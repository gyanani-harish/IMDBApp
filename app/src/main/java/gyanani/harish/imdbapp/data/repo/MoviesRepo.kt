package gyanani.harish.imdbapp.data.repo

import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import gyanani.harish.imdbapp.data.model.MovieBean
import org.json.JSONArray
import org.json.JSONObject
import java.lang.reflect.Type;


class MoviesRepo {
    fun fetchData(): MutableList<MovieBean> {
        val mockJson = "{\n" +
                "  \"dates\": {\n" +
                "    \"maximum\": \"2022-11-24\",\n" +
                "    \"minimum\": \"2022-10-07\"\n" +
                "  },\n" +
                "  \"page\": 1,\n" +
                "  \"results\": [\n" +
                "    {\n" +
                "      \"adult\": false,\n" +
                "      \"backdrop_path\": \"/bQXAqRx2Fgc46uCVWgoPz5L5Dtr.jpg\",\n" +
                "      \"genre_ids\": [\n" +
                "        28,\n" +
                "        14,\n" +
                "        878\n" +
                "      ],\n" +
                "      \"id\": 436270,\n" +
                "      \"original_language\": \"en\",\n" +
                "      \"original_title\": \"Black Adam\",\n" +
                "      \"overview\": \"Nearly 5,000 years after he was bestowed with the almighty powers of the Egyptian gods—and imprisoned just as quickly—Black Adam is freed from his earthly tomb, ready to unleash his unique form of justice on the modern world.\",\n" +
                "      \"popularity\": 8684.035,\n" +
                "      \"poster_path\": \"/pFlaoHTZeyNkG83vxsAJiGzfSsa.jpg\",\n" +
                "      \"release_date\": \"2022-10-19\",\n" +
                "      \"title\": \"Black Adam\",\n" +
                "      \"video\": false,\n" +
                "      \"vote_average\": 6.9,\n" +
                "      \"vote_count\": 1158\n" +
                "    },\n" +
                "    {\n" +
                "      \"adult\": false,\n" +
                "      \"backdrop_path\": \"/olPXihyFeeNvnaD6IOBltgIV1FU.jpg\",\n" +
                "      \"genre_ids\": [\n" +
                "        27,\n" +
                "        9648,\n" +
                "        53\n" +
                "      ],\n" +
                "      \"id\": 882598,\n" +
                "      \"original_language\": \"en\",\n" +
                "      \"original_title\": \"Smile\",\n" +
                "      \"overview\": \"After witnessing a bizarre, traumatic incident involving a patient, Dr. Rose Cotter starts experiencing frightening occurrences that she can't explain. As an overwhelming terror begins taking over her life, Rose must confront her troubling past in order to survive and escape her horrifying new reality.\",\n" +
                "      \"popularity\": 3871.704,\n" +
                "      \"poster_path\": \"/aPqcQwu4VGEewPhagWNncDbJ9Xp.jpg\",\n" +
                "      \"release_date\": \"2022-09-23\",\n" +
                "      \"title\": \"Smile\",\n" +
                "      \"video\": false,\n" +
                "      \"vote_average\": 6.8,\n" +
                "      \"vote_count\": 638\n" +
                "    },\n" +
                "    {\n" +
                "      \"adult\": false,\n" +
                "      \"backdrop_path\": \"/yYrvN5WFeGYjJnRzhY0QXuo4Isw.jpg\",\n" +
                "      \"genre_ids\": [\n" +
                "        28,\n" +
                "        12,\n" +
                "        878\n" +
                "      ],\n" +
                "      \"id\": 505642,\n" +
                "      \"original_language\": \"en\",\n" +
                "      \"original_title\": \"Black Panther: Wakanda Forever\",\n" +
                "      \"overview\": \"Queen Ramonda, Shuri, M’Baku, Okoye and the Dora Milaje fight to protect their nation from intervening world powers in the wake of King T’Challa’s death. As the Wakandans strive to embrace their next chapter, the heroes must band together with the help of War Dog Nakia and Everett Ross and forge a new path for the kingdom of Wakanda.\",\n" +
                "      \"popularity\": 3441.331,\n" +
                "      \"poster_path\": \"/sv1xJUazXeYqALzczSZ3O6nkH75.jpg\",\n" +
                "      \"release_date\": \"2022-11-09\",\n" +
                "      \"title\": \"Black Panther: Wakanda Forever\",\n" +
                "      \"video\": false,\n" +
                "      \"vote_average\": 7.5,\n" +
                "      \"vote_count\": 747\n" +
                "    },\n" +
                "    {\n" +
                "      \"adult\": false,\n" +
                "      \"backdrop_path\": \"/y5Z0WesTjvn59jP6yo459eUsbli.jpg\",\n" +
                "      \"genre_ids\": [\n" +
                "        27,\n" +
                "        53\n" +
                "      ],\n" +
                "      \"id\": 663712,\n" +
                "      \"original_language\": \"en\",\n" +
                "      \"original_title\": \"Terrifier 2\",\n" +
                "      \"overview\": \"After being resurrected by a sinister entity, Art the Clown returns to Miles County where he must hunt down and destroy a teenage girl and her younger brother on Halloween night.  As the body count rises, the siblings fight to stay alive while uncovering the true nature of Art's evil intent.\",\n" +
                "      \"popularity\": 2033.463,\n" +
                "      \"poster_path\": \"/b6IRp6Pl2Fsq37r9jFhGoLtaqHm.jpg\",\n" +
                "      \"release_date\": \"2022-10-06\",\n" +
                "      \"title\": \"Terrifier 2\",\n" +
                "      \"video\": false,\n" +
                "      \"vote_average\": 7,\n" +
                "      \"vote_count\": 616\n" +
                "    },\n" +
                "    {\n" +
                "      \"adult\": false,\n" +
                "      \"backdrop_path\": \"/tUBN1paMQ1tmVA5Sjy1ZjPWVsiF.jpg\",\n" +
                "      \"genre_ids\": [\n" +
                "        12,\n" +
                "        16,\n" +
                "        35,\n" +
                "        10751,\n" +
                "        14\n" +
                "      ],\n" +
                "      \"id\": 676701,\n" +
                "      \"original_language\": \"es\",\n" +
                "      \"original_title\": \"Tadeo Jones 3: La Tabla Esmeralda\",\n" +
                "      \"overview\": \"Tad would love for his archeologist colleagues to accept him as one of their own, but he always messes everything up. Tad accidentally destroys a sarcophagus and unleashes an ancient spell endangering the lives of his friends: Mummy, Jeff and Belzoni. With everyone against him and only helped by Sara, he sets off on an adventure that will take him from Mexico to Chicago and from Paris to Egypt, in order to put an end to the curse of the Mummy.\",\n" +
                "      \"popularity\": 1979.806,\n" +
                "      \"poster_path\": \"/jvIVl8zdNSOAJImw1elQEzxStMN.jpg\",\n" +
                "      \"release_date\": \"2022-08-24\",\n" +
                "      \"title\": \"Tad the Lost Explorer and the Emerald Tablet\",\n" +
                "      \"video\": false,\n" +
                "      \"vote_average\": 7.9,\n" +
                "      \"vote_count\": 86\n" +
                "    },\n" +
                "    {\n" +
                "      \"adult\": false,\n" +
                "      \"backdrop_path\": \"/f9g3R9gq0bASip9RnK2H56dbb5j.jpg\",\n" +
                "      \"genre_ids\": [\n" +
                "        53\n" +
                "      ],\n" +
                "      \"id\": 979924,\n" +
                "      \"original_language\": \"en\",\n" +
                "      \"original_title\": \"On the Line\",\n" +
                "      \"overview\": \"A provocative and edgy radio host must play a dangerous game of cat and mouse with a mysterious caller who's kidnapped his family and is threatening to blow up the whole station.\",\n" +
                "      \"popularity\": 1439.993,\n" +
                "      \"poster_path\": \"/jVmWI8PqoVTHCnrLYAcyrclzeY0.jpg\",\n" +
                "      \"release_date\": \"2022-10-31\",\n" +
                "      \"title\": \"On the Line\",\n" +
                "      \"video\": false,\n" +
                "      \"vote_average\": 6.5,\n" +
                "      \"vote_count\": 120\n" +
                "    },\n" +
                "    {\n" +
                "      \"adult\": false,\n" +
                "      \"backdrop_path\": \"/gVecEIEZLZg3pV5CACXAB48I6au.jpg\",\n" +
                "      \"genre_ids\": [\n" +
                "        80,\n" +
                "        18,\n" +
                "        9648,\n" +
                "        53\n" +
                "      ],\n" +
                "      \"id\": 862965,\n" +
                "      \"original_language\": \"en\",\n" +
                "      \"original_title\": \"Emily the Criminal\",\n" +
                "      \"overview\": \"Emily, who is saddled with student debt and locked out of the job market due to a minor criminal record, gets involved in a credit card scam that pulls her into the criminal underworld of Los Angeles, ultimately leading to deadly consequences.\",\n" +
                "      \"popularity\": 1548.549,\n" +
                "      \"poster_path\": \"/iZvzMpREGiqDQ5eYbx8z70qPgst.jpg\",\n" +
                "      \"release_date\": \"2022-08-12\",\n" +
                "      \"title\": \"Emily the Criminal\",\n" +
                "      \"video\": false,\n" +
                "      \"vote_average\": 6.8,\n" +
                "      \"vote_count\": 181\n" +
                "    },\n" +
                "    {\n" +
                "      \"adult\": false,\n" +
                "      \"backdrop_path\": \"/1DBDwevWS8OhiT3wqqlW7KGPd6m.jpg\",\n" +
                "      \"genre_ids\": [\n" +
                "        53\n" +
                "      ],\n" +
                "      \"id\": 985939,\n" +
                "      \"original_language\": \"en\",\n" +
                "      \"original_title\": \"Fall\",\n" +
                "      \"overview\": \"For best friends Becky and Hunter, life is all about conquering fears and pushing limits. But after they climb 2,000 feet to the top of a remote, abandoned radio tower, they find themselves stranded with no way down. Now Becky and Hunter’s expert climbing skills will be put to the ultimate test as they desperately fight to survive the elements, a lack of supplies, and vertigo-inducing heights\",\n" +
                "      \"popularity\": 1176.073,\n" +
                "      \"poster_path\": \"/spCAxD99U1A6jsiePFoqdEcY0dG.jpg\",\n" +
                "      \"release_date\": \"2022-08-11\",\n" +
                "      \"title\": \"Fall\",\n" +
                "      \"video\": false,\n" +
                "      \"vote_average\": 7.3,\n" +
                "      \"vote_count\": 1745\n" +
                "    },\n" +
                "    {\n" +
                "      \"adult\": false,\n" +
                "      \"backdrop_path\": \"/mqsPyyeDCBAghXyjbw4TfEYwljw.jpg\",\n" +
                "      \"genre_ids\": [\n" +
                "        10752,\n" +
                "        18,\n" +
                "        28\n" +
                "      ],\n" +
                "      \"id\": 49046,\n" +
                "      \"original_language\": \"de\",\n" +
                "      \"original_title\": \"Im Westen nichts Neues\",\n" +
                "      \"overview\": \"Paul Baumer and his friends Albert and Muller, egged on by romantic dreams of heroism, voluntarily enlist in the German army. Full of excitement and patriotic fervour, the boys enthusiastically march into a war they believe in. But once on the Western Front, they discover the soul-destroying horror of World War I.\",\n" +
                "      \"popularity\": 1138.267,\n" +
                "      \"poster_path\": \"/hYqOjJ7Gh1fbqXrxlIao1g8ZehF.jpg\",\n" +
                "      \"release_date\": \"2022-10-07\",\n" +
                "      \"title\": \"All Quiet on the Western Front\",\n" +
                "      \"video\": false,\n" +
                "      \"vote_average\": 7.8,\n" +
                "      \"vote_count\": 818\n" +
                "    },\n" +
                "    {\n" +
                "      \"adult\": false,\n" +
                "      \"backdrop_path\": \"/5GA3vV1aWWHTSDO5eno8V5zDo8r.jpg\",\n" +
                "      \"genre_ids\": [\n" +
                "        27,\n" +
                "        53\n" +
                "      ],\n" +
                "      \"id\": 760161,\n" +
                "      \"original_language\": \"en\",\n" +
                "      \"original_title\": \"Orphan: First Kill\",\n" +
                "      \"overview\": \"After escaping from an Estonian psychiatric facility, Leena Klammer travels to America by impersonating Esther, the missing daughter of a wealthy family. But when her mask starts to slip, she is put against a mother who will protect her family from the murderous “child” at any cost.\",\n" +
                "      \"popularity\": 957.873,\n" +
                "      \"poster_path\": \"/pHkKbIRoCe7zIFvqan9LFSaQAde.jpg\",\n" +
                "      \"release_date\": \"2022-07-27\",\n" +
                "      \"title\": \"Orphan: First Kill\",\n" +
                "      \"video\": false,\n" +
                "      \"vote_average\": 6.8,\n" +
                "      \"vote_count\": 1301\n" +
                "    },\n" +
                "    {\n" +
                "      \"adult\": false,\n" +
                "      \"backdrop_path\": \"/tIX6j3NzadlwGcJ52nuWdmtOQkg.jpg\",\n" +
                "      \"genre_ids\": [\n" +
                "        27,\n" +
                "        53,\n" +
                "        9648\n" +
                "      ],\n" +
                "      \"id\": 717728,\n" +
                "      \"original_language\": \"en\",\n" +
                "      \"original_title\": \"Jeepers Creepers: Reborn\",\n" +
                "      \"overview\": \"Forced to travel with her boyfriend to a horror festival, Laine begins to experience disturbing visions associated with the urban legend of The Creeper. As the festival arrives and the blood-soaked entertainment builds to a frenzy, she becomes the center of it while something unearthly has been summoned.\",\n" +
                "      \"popularity\": 1435.419,\n" +
                "      \"poster_path\": \"/qVVegwPsW6n9unBtLWq1rzOutka.jpg\",\n" +
                "      \"release_date\": \"2022-09-15\",\n" +
                "      \"title\": \"Jeepers Creepers: Reborn\",\n" +
                "      \"video\": false,\n" +
                "      \"vote_average\": 5.8,\n" +
                "      \"vote_count\": 468\n" +
                "    },\n" +
                "    {\n" +
                "      \"adult\": false,\n" +
                "      \"backdrop_path\": \"/iVtpnbPE91vmi3LmcOXycEblwPA.jpg\",\n" +
                "      \"genre_ids\": [\n" +
                "        10749,\n" +
                "        35\n" +
                "      ],\n" +
                "      \"id\": 833097,\n" +
                "      \"original_language\": \"en\",\n" +
                "      \"original_title\": \"Falling for Christmas\",\n" +
                "      \"overview\": \"A newly engaged and spoiled hotel heiress finds herself in the care of a handsome, blue-collar lodge owner and his precocious daughter after getting total amnesia in a skiing accident.\",\n" +
                "      \"popularity\": 952.958,\n" +
                "      \"poster_path\": \"/6GkphwL9s6dZb3DoQS9OQ4LcPgY.jpg\",\n" +
                "      \"release_date\": \"2022-11-10\",\n" +
                "      \"title\": \"Falling for Christmas\",\n" +
                "      \"video\": false,\n" +
                "      \"vote_average\": 6.7,\n" +
                "      \"vote_count\": 208\n" +
                "    },\n" +
                "    {\n" +
                "      \"adult\": false,\n" +
                "      \"backdrop_path\": \"/aQOWnw3HydsCQZ10O0wvxFOaWc3.jpg\",\n" +
                "      \"genre_ids\": [\n" +
                "        36,\n" +
                "        28,\n" +
                "        18\n" +
                "      ],\n" +
                "      \"id\": 551271,\n" +
                "      \"original_language\": \"en\",\n" +
                "      \"original_title\": \"Medieval\",\n" +
                "      \"overview\": \"The story of 14th century Czech icon and warlord Jan Zizka who defeated armies of the Teutonic Order and the Holy Roman Empire.\",\n" +
                "      \"popularity\": 1698.152,\n" +
                "      \"poster_path\": \"/4njdAkiBdC5LnFApeXSkFQ78GdT.jpg\",\n" +
                "      \"release_date\": \"2022-09-08\",\n" +
                "      \"title\": \"Medieval\",\n" +
                "      \"video\": false,\n" +
                "      \"vote_average\": 7.2,\n" +
                "      \"vote_count\": 135\n" +
                "    },\n" +
                "    {\n" +
                "      \"adult\": false,\n" +
                "      \"backdrop_path\": \"/2cQMVHBaP1wK0UBX5SGDahB3lp3.jpg\",\n" +
                "      \"genre_ids\": [\n" +
                "        9648,\n" +
                "        53,\n" +
                "        27\n" +
                "      ],\n" +
                "      \"id\": 807356,\n" +
                "      \"original_language\": \"en\",\n" +
                "      \"original_title\": \"Watcher\",\n" +
                "      \"overview\": \"As a serial killer stalks the city, Julia — a young actress who just moved to town with her husband — notices a mysterious stranger watching her from across the street.\",\n" +
                "      \"popularity\": 936.911,\n" +
                "      \"poster_path\": \"/6Hg1l0alQNdCbFSVodRyR78A84w.jpg\",\n" +
                "      \"release_date\": \"2022-06-03\",\n" +
                "      \"title\": \"Watcher\",\n" +
                "      \"video\": false,\n" +
                "      \"vote_average\": 6.3,\n" +
                "      \"vote_count\": 293\n" +
                "    },\n" +
                "    {\n" +
                "      \"adult\": false,\n" +
                "      \"backdrop_path\": \"/AaV1YIdWKnjAIAOe8UUKBFm327v.jpg\",\n" +
                "      \"genre_ids\": [\n" +
                "        28,\n" +
                "        18\n" +
                "      ],\n" +
                "      \"id\": 361743,\n" +
                "      \"original_language\": \"en\",\n" +
                "      \"original_title\": \"Top Gun: Maverick\",\n" +
                "      \"overview\": \"After more than thirty years of service as one of the Navy’s top aviators, and dodging the advancement in rank that would ground him, Pete “Maverick” Mitchell finds himself training a detachment of TOP GUN graduates for a specialized mission the likes of which no living pilot has ever seen.\",\n" +
                "      \"popularity\": 755.371,\n" +
                "      \"poster_path\": \"/62HCnUTziyWcpDaBO2i1DX17ljH.jpg\",\n" +
                "      \"release_date\": \"2022-05-24\",\n" +
                "      \"title\": \"Top Gun: Maverick\",\n" +
                "      \"video\": false,\n" +
                "      \"vote_average\": 8.3,\n" +
                "      \"vote_count\": 4766\n" +
                "    },\n" +
                "    {\n" +
                "      \"adult\": false,\n" +
                "      \"backdrop_path\": \"/2iGUavwv86Hubv3V5Iq4qEQXDfE.jpg\",\n" +
                "      \"genre_ids\": [\n" +
                "        18,\n" +
                "        53,\n" +
                "        27\n" +
                "      ],\n" +
                "      \"id\": 848058,\n" +
                "      \"original_language\": \"es\",\n" +
                "      \"original_title\": \"Cerdita\",\n" +
                "      \"overview\": \"A bullied overweight teenager sees a glimpse of hope when her tormentors are brutally abducted by a mesmerizing stranger.\",\n" +
                "      \"popularity\": 633.124,\n" +
                "      \"poster_path\": \"/8EIQAvJjXdbNDMmBtHtgGqbc09V.jpg\",\n" +
                "      \"release_date\": \"2022-10-07\",\n" +
                "      \"title\": \"Piggy\",\n" +
                "      \"video\": false,\n" +
                "      \"vote_average\": 6.7,\n" +
                "      \"vote_count\": 203\n" +
                "    },\n" +
                "    {\n" +
                "      \"adult\": false,\n" +
                "      \"backdrop_path\": \"/Ach0puWzxuO2imh1yWEUK7CGsx.jpg\",\n" +
                "      \"genre_ids\": [\n" +
                "        16,\n" +
                "        12,\n" +
                "        28,\n" +
                "        14\n" +
                "      ],\n" +
                "      \"id\": 900667,\n" +
                "      \"original_language\": \"ja\",\n" +
                "      \"original_title\": \"ONE PIECE FILM RED\",\n" +
                "      \"overview\": \"Uta — the most beloved singer in the world. Her voice, which she sings with while concealing her true identity, has been described as “otherworldly.” She will appear in public for the first time at a live concert. As the venue fills with all kinds of Uta fans — excited pirates, the Navy watching closely, and the Straw Hats led by Luffy who simply came to enjoy her sonorous performance — the voice that the whole world has been waiting for is about to resound.\",\n" +
                "      \"popularity\": 567.715,\n" +
                "      \"poster_path\": \"/m80kPdrmmtEh9wlLroCp0bwUGH0.jpg\",\n" +
                "      \"release_date\": \"2022-08-06\",\n" +
                "      \"title\": \"One Piece Film Red\",\n" +
                "      \"video\": false,\n" +
                "      \"vote_average\": 7.4,\n" +
                "      \"vote_count\": 180\n" +
                "    },\n" +
                "    {\n" +
                "      \"adult\": false,\n" +
                "      \"backdrop_path\": \"/79PcXPpbDWql74h8Y00mNwbYMbS.jpg\",\n" +
                "      \"genre_ids\": [\n" +
                "        80,\n" +
                "        35,\n" +
                "        36,\n" +
                "        9648,\n" +
                "        53\n" +
                "      ],\n" +
                "      \"id\": 664469,\n" +
                "      \"original_language\": \"en\",\n" +
                "      \"original_title\": \"Amsterdam\",\n" +
                "      \"overview\": \"In the 1930s, three friends—a doctor, a nurse, and an attorney—witness a murder, become suspects themselves and uncover one of the most outrageous plots in North American history.\",\n" +
                "      \"popularity\": 444.824,\n" +
                "      \"poster_path\": \"/6sJcVzGCwrDCBMV0DU6eRzA2UxM.jpg\",\n" +
                "      \"release_date\": \"2022-09-27\",\n" +
                "      \"title\": \"Amsterdam\",\n" +
                "      \"video\": false,\n" +
                "      \"vote_average\": 6.1,\n" +
                "      \"vote_count\": 320\n" +
                "    },\n" +
                "    {\n" +
                "      \"adult\": false,\n" +
                "      \"backdrop_path\": \"/au4HUSWDRadIcl9CqySlw1kJMfo.jpg\",\n" +
                "      \"genre_ids\": [\n" +
                "        80,\n" +
                "        28,\n" +
                "        53\n" +
                "      ],\n" +
                "      \"id\": 829799,\n" +
                "      \"original_language\": \"en\",\n" +
                "      \"original_title\": \"Paradise City\",\n" +
                "      \"overview\": \"Renegade bounty hunter Ryan Swan must carve his way through the Hawaiian crime world to wreak vengeance on the kingpin who murdered his father.\",\n" +
                "      \"popularity\": 647.178,\n" +
                "      \"poster_path\": \"/xdmmd437QdjcCls8yCQxrH5YYM4.jpg\",\n" +
                "      \"release_date\": \"2022-11-11\",\n" +
                "      \"title\": \"Paradise City\",\n" +
                "      \"video\": false,\n" +
                "      \"vote_average\": 6.7,\n" +
                "      \"vote_count\": 7\n" +
                "    },\n" +
                "    {\n" +
                "      \"adult\": false,\n" +
                "      \"backdrop_path\": \"/jBIMZ0AlUYuFNsKbd4L6FojWMoy.jpg\",\n" +
                "      \"genre_ids\": [\n" +
                "        16,\n" +
                "        35,\n" +
                "        10749\n" +
                "      ],\n" +
                "      \"id\": 820067,\n" +
                "      \"original_language\": \"ja\",\n" +
                "      \"original_title\": \"映画 五等分の花嫁\",\n" +
                "      \"overview\": \"When five lovely young girls who hate studying hire part-time tutor Futaro, he guides not only their education but also their hearts. Time spent has brought them all closer, with feelings growing within the girls and Futaro. As they finish their third year of high school and their last school festival approaches, they set their sights on what’s next. Is there a future with one of them and Futaro?\",\n" +
                "      \"popularity\": 456.598,\n" +
                "      \"poster_path\": \"/sg7klpt1xwK1IJirBI9EHaqQwJ5.jpg\",\n" +
                "      \"release_date\": \"2022-05-20\",\n" +
                "      \"title\": \"The Quintessential Quintuplets Movie\",\n" +
                "      \"video\": false,\n" +
                "      \"vote_average\": 9.1,\n" +
                "      \"vote_count\": 98\n" +
                "    }\n" +
                "  ],\n" +
                "  \"total_pages\": 93,\n" +
                "  \"total_results\": 1849\n" +
                "}"
        val jsonObject = JSONObject(mockJson)
        val resultsArray = jsonObject.get("results") as JSONArray
        val listType: Type = object : TypeToken<MutableList<MovieBean?>?>() {}.type
        val moviesList: MutableList<MovieBean> = Gson().fromJson(resultsArray.toString(), listType)
        return moviesList
    }
}