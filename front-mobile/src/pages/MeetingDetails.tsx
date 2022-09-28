import { useRoute } from '@react-navigation/native';
import React, { useEffect, useState } from 'react';

import { View , Text, ScrollView } from 'react-native';
import { DetailsType } from '../components/MeetingCard';
import { api } from '../services';
import { text, theme } from '../styles';
import { MeetingType } from './Meetings';


const MeetingDetails: React.FC<DetailsType> = ({route:{params:{id}}}) => {

    const [ meetingData, setMeetingDate ] = useState<MeetingType>();

    async function fillMeeting (){
        const res = await api.get(`/meetings/${id}`)
        setMeetingDate(res.data);
    }

    useEffect(() => {
        fillMeeting();
    }, [])

    return(

        <ScrollView style={theme.container}>
            <View style={theme.meetingsContainer}>
                <View style={theme.meetingDetails}>
                    <View style={theme.detailsInfo}>
                        <Text style={text.infoType}>
                            Oração:
                        </Text>
                        <Text style={text.infoData}>
                            {meetingData?.prayers.map(a => {
                                if(a.moment === "Inicio") {
                                    return a.designation.person;
                                }
                            })}
                        </Text>
                    </View>

                    <Text style={text.infoTitle}>
                        Cântico: 51
                    </Text>
                </View>

            </View>
        </ScrollView>


    )
}

export default MeetingDetails;